package com.example.cpu10225.research.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by cpu10225 on 10/11/2017.
 */

@Entity(nameInDb = "owner")
public class Owner {
    @Id(autoincrement = true)
    private Long id;
    @Property(nameInDb = "reputation")
    @SerializedName("reputation")
    @Expose
    private Integer reputation;
    @Property(nameInDb = "user_id")
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @Property(nameInDb = "user_type")
    @SerializedName("user_type")
    @Expose
    private String userType;
    @Property(nameInDb = "profile_image")
    @SerializedName("profile_image")
    @Expose
    private String profileImage;
    @Property(nameInDb = "display_name")
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @Property(nameInDb = "link")
    @SerializedName("link")
    @Expose
    private String link;
    @Property(nameInDb = "accept_rate")
    @SerializedName("accept_rate")
    @Expose
    private Integer acceptRate;

    @Generated(hash = 640712644)
    public Owner(Long id, Integer reputation, Integer userId, String userType,
            String profileImage, String displayName, String link,
            Integer acceptRate) {
        this.id = id;
        this.reputation = reputation;
        this.userId = userId;
        this.userType = userType;
        this.profileImage = profileImage;
        this.displayName = displayName;
        this.link = link;
        this.acceptRate = acceptRate;
    }

    @Generated(hash = 748179547)
    public Owner() {
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getAcceptRate() {
        return acceptRate;
    }

    public void setAcceptRate(Integer acceptRate) {
        this.acceptRate = acceptRate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}