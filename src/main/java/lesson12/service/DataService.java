package lesson12.service;

import lesson12.model.User;

public interface DataService {
    public void save(User user);

    public void delete(User user);
}
