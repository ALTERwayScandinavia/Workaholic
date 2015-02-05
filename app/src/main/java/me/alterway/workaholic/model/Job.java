package me.alterway.workaholic.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Job implements Parcelable
{
    private long id;
    private int deadline;
    private String workplace,position,description;
    private double salary,tax;
    private boolean isActive;

    public Job() {}

    public Job(String workplace, String position, double salary, double tax, int deadline, boolean isActive, String description)
    {
        this.workplace = workplace;
        this.position = position;
        this.salary = salary;
        this.tax = tax;
        this.deadline = deadline;
        this.isActive = isActive;
        this.description = description;
    }

    public Job(long id, String workplace, String position, double salary, double tax, int deadline, boolean isActive, String description)
    {
        this.id = id;
        this.workplace = workplace;
        this.position = position;
        this.salary = salary;
        this.tax = tax;
        this.deadline = deadline;
        this.isActive = isActive;
        this.description = description;
    }

    public Job(Parcel in)
    {
        this.id = in.readLong();
        this.workplace = in.readString();
        this.position = in.readString();
        this.salary = in.readDouble();
        this.tax = in.readDouble();
        this.deadline = in.readInt();
        this.isActive = in.readByte() == 1;
        this.description = in.readString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public boolean IsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return workplace;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags)
    {
        out.writeLong(id);
        out.writeString(workplace);
        out.writeString(position);
        out.writeDouble(salary);
        out.writeDouble(tax);
        out.writeInt(deadline);
        out.writeByte((byte) (isActive ? 1 : 0));
        out.writeString(description);
    }

    public static final Parcelable.Creator<Job> CREATOR = new Parcelable.Creator<Job>()
    {
        public Job createFromParcel(Parcel in)
        {
            return new Job(in);
        }
        public Job[] newArray(int size)
        {
            return new Job[size];
        }
    };

}

