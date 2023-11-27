package org.np.tolet.domain;

import org.np.tolet.enumeration.HouseType;
import org.np.tolet.enumeration.TenantType;

import java.util.Objects;

public class Post implements Comparable<Post> {
    private long id;
    private String description;

    private Area area;

    private HouseType houseType;

    private TenantType tenantType;

    private User postedBy;

    private String contactNumber;

    private boolean isEnabled;

    private String addDateTime;


    public Post() {
    }

    public Post(long id, String description, Area area, HouseType houseType, TenantType tenantType, User postedBy, String contactNumber, boolean isEnabled, String addDateTime) {
        this.id = id;
        this.description = description;
        this.area = area;
        this.houseType = houseType;
        this.tenantType = tenantType;
        this.postedBy = postedBy;
        this.contactNumber = contactNumber;
        this.isEnabled = isEnabled;
        this.addDateTime = addDateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public TenantType getTenantType() {
        return tenantType;
    }

    public void setTenantType(TenantType tenantType) {
        this.tenantType = tenantType;
    }

    public User getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(User postedBy) {
        this.postedBy = postedBy;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String getAddDateTime() {
        return addDateTime;
    }

    public void setAddDateTime(String addDateTime) {
        this.addDateTime = addDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id == post.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Post o) {
        return (int) (this.id - o.getId());
    }
}
