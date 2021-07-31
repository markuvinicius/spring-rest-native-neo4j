package com.markuvinicius.graph.springrestnativeneo4j.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity(label="PARTNERSHIP")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Partnership {
    @Id @GeneratedValue
    private Long id;

    private Float shareHolding;

    @Relationship(type="IS_PARTNER", direction = Relationship.INCOMING)
    private Person partner;
}
