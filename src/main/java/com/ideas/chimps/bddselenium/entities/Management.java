package com.ideas.chimps.bddselenium.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Management {
    private String name;
    private List<SubModule> subModules;
}
