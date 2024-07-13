package com.developersoccerclub.generic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author leandro
 */
@MappedSuperclass
public abstract class GenericEntity implements Serializable {
    private Boolean active;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegister;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdate;

    public GenericEntity() {
        active = Boolean.TRUE;
        setDateRegister(new Date());
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
    
    
}
