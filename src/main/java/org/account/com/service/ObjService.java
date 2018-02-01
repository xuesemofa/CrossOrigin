package org.account.com.service;

import org.account.com.model.ObjectModel;
import org.account.com.model.ObjectModel2;

import java.util.List;

public interface ObjService {
    List<ObjectModel> findAll();
    ObjectModel2 findAll2();
}
