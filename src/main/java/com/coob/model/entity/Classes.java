package com.coob.model.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
public class Classes {
    private Integer cid;
    private String cname;
}
