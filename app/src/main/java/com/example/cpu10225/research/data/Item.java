package com.example.cpu10225.research.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Unique;

/**
 * Created by cpu10225 on 10/11/2017.
 */

@Entity(nameInDb = "item")
public class Item {
    @Id(autoincrement = true)
    private Long id;
    @Property(nameInDb = "ownerId")
    private long ownerId;
    @Property(nameInDb = "owner")
    @ToOne(joinProperty = "ownerId")
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @Property(nameInDb = "is_accepted")
    @SerializedName("is_accepted")
    @Expose
    private Boolean isAccepted;
    @Property(nameInDb = "score")
    @SerializedName("score")
    @Expose
    private Integer score;
    @Property(nameInDb = "last_activity_date")
    @SerializedName("last_activity_date")
    @Expose
    private Integer lastActivityDate;
    @Property(nameInDb = "creation_date")
    @SerializedName("creation_date")
    @Expose
    private Integer creationDate;
    @Property(nameInDb = "answer_id")
    @SerializedName("answer_id")
    @Expose
    private Integer answerId;
    @Property(nameInDb = "question_id")
    @SerializedName("question_id")
    @Expose
    private Integer questionId;
    @Property(nameInDb = "last_edit_date")
    @SerializedName("last_edit_date")
    @Expose
    private Integer lastEditDate;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(Boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Integer lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Integer lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

}
