package com.smartbudget.budgetmanagement.repository;

import com.smartbudget.budgetmanagement.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
