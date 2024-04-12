package com.gomugomu.ma_java_avancee_projet_backend.user;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {

  @Value("${config.pagination.size}")
  private byte paginationSize;

  @Autowired
  private UserRepository userRepository;

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public Page<User> getAllUsers(Integer page, List<Integer> types, String sort, String order) {
    String sortField = (sort != null) ? sort : "createdAt";
    Sort.Direction sortOrder = Sort.Direction.fromOptionalString(order).orElse(Sort.Direction.ASC);
    Pageable pageable = PageRequest.of(page, paginationSize, Sort.by(sortOrder, sortField));

    Specification<User> spec = (root, query, cb) -> {
      if (types == null || types.isEmpty()) {
        return null;
      } else {
        return root.get("type").in(types);
      }
    };

    return userRepository.findAll(spec, pageable);
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }
}