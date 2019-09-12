package com.my.repository;

import com.my.domain.Classes;

public interface ClassesRepository {
    Classes findById(int id);
}
