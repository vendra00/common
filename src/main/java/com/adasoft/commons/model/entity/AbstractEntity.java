package com.adasoft.commons.model.entity;

import com.adasoft.commons.model.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public abstract class AbstractEntity {

    @Id
    private String id;

    private String filename;
    private EventType eventType;

    @LastModifiedDate
    private Date lastUpdate;

}
