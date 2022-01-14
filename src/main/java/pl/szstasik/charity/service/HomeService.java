package pl.szstasik.charity.service;

import pl.szstasik.charity.model.Institution;

import java.util.List;

public interface HomeService {
    int bagsSum();
    int dontationsSum();
    List<Institution> institutions();
}
