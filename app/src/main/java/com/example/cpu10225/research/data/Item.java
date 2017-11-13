package com.example.cpu10225.research.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by cpu10225 on 10/11/2017.
 */

@Entity(nameInDb = "item")
public class Item {
    @Id
    private Long id;
    @Property(nameInDb = "ownerId")
    private long ownerId;
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
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 182764869)
    private transient ItemDao myDao;
    @Generated(hash = 1219895832)
    public Item(Long id, long ownerId, Boolean isAccepted, Integer score,
            Integer lastActivityDate, Integer creationDate, Integer answerId,
            Integer questionId, Integer lastEditDate) {
        this.id = id;
        this.ownerId = ownerId;
        this.isAccepted = isAccepted;
        this.score = score;
        this.lastActivityDate = lastActivityDate;
        this.creationDate = creationDate;
        this.answerId = answerId;
        this.questionId = questionId;
        this.lastEditDate = lastEditDate;
    }
    @Generated(hash = 1470900980)
    public Item() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getOwnerId() {
        return this.ownerId;
    }
    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }
    public Boolean getIsAccepted() {
        return this.isAccepted;
    }
    public void setIsAccepted(Boolean isAccepted) {
        this.isAccepted = isAccepted;
    }
    public Integer getScore() {
        return this.score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public Integer getLastActivityDate() {
        return this.lastActivityDate;
    }
    public void setLastActivityDate(Integer lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }
    public Integer getCreationDate() {
        return this.creationDate;
    }
    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }
    public Integer getAnswerId() {
        return this.answerId;
    }
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }
    public Integer getQuestionId() {
        return this.questionId;
    }
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
    public Integer getLastEditDate() {
        return this.lastEditDate;
    }
    public void setLastEditDate(Integer lastEditDate) {
        this.lastEditDate = lastEditDate;
    }
    @Generated(hash = 1847295403)
    private transient Long owner__resolvedKey;
    /** To-one relationship, resolved on first access. */
    @Generated(hash = 136625949)
    public Owner getOwner() {
        long __key = this.ownerId;
        if (owner__resolvedKey == null || !owner__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            OwnerDao targetDao = daoSession.getOwnerDao();
            Owner ownerNew = targetDao.load(__key);
            synchronized (this) {
                owner = ownerNew;
                owner__resolvedKey = __key;
            }
        }
        return owner;
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 204407784)
    public void setOwner(@NotNull Owner owner) {
        if (owner == null) {
            throw new DaoException(
                    "To-one property 'ownerId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.owner = owner;
            ownerId = owner.getId();
            owner__resolvedKey = ownerId;
        }
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 881068859)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getItemDao() : null;
    }
}
