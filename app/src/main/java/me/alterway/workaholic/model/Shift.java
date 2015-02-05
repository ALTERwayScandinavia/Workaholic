package me.alterway.workaholic.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Shift implements Parcelable
{
    private long id,jobId;
    private long start,end,pause;

    public Shift() {}

    public Shift(long jobId, long start, long end, long pause)
    {
        this.jobId = jobId;
        this.start = start;
        this.end = end;
        this.pause = pause;
    }

    public Shift(long id, long jobId, long start, long end, long pause)
    {
        this.id = id;
        this.jobId = jobId;
        this.start = start;
        this.end = end;
        this.pause = pause;
    }

    public Shift(Parcel in)
    {
        this.id = in.readLong();
        this.jobId = in.readLong();
        this.start = in.readLong();
        this.end = in.readLong();
        this.pause = in.readLong();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public long getPause() {
        return pause;
    }

    public void setPause(long pause) {
        this.pause = pause;
    }
    @Override
    public String toString() {
        return "Shift [id=" + id + ", jobId=" + jobId + ", start=" + start
                + ", end=" + end + ", pause=" + pause + "]";
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags)
    {
        out.writeLong(id);
        out.writeLong(jobId);
        out.writeLong(start);
        out.writeLong(end);
        out.writeLong(pause);
    }

    public static final Parcelable.Creator<Shift> CREATOR = new Parcelable.Creator<Shift>()
    {
        public Shift createFromParcel(Parcel in)
        {
            return new Shift(in);
        }
        public Shift[] newArray(int size)
        {
            return new Shift[size];
        }
    };


}

