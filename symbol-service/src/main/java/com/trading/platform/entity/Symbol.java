package com.trading.platform.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "symbol")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Symbol implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

}
