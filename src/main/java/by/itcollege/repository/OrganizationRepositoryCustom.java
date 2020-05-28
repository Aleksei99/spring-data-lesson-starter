package by.itcollege.repository;

import by.itcollege.entity.Organization;

/**
 * @author alexandergorovtsov
 */
public interface OrganizationRepositoryCustom {

    Organization findByName(String name);
}
