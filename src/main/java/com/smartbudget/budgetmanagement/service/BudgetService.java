package com.smartbudget.budgetmanagement.service;

import com.smartbudget.budgetmanagement.model.Budget;
import com.smartbudget.budgetmanagement.repository.BudgetRepository;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    public Budget createBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public Budget updateBudget(Long id, Budget budgetDetails) {
        Budget budget = budgetRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Budget not found"));
        budget.setName(budgetDetails.getName());
        budget.setAmount(budgetDetails.getAmount());
        budget.setGoal(budgetDetails.getGoal());
        budget.setLimit(budgetDetails.getLimit());
        return budgetRepository.save(budget);
    }

    public Budget getBudget(Long id) {
        return budgetRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Budget not found"));
    }

    public void deleteBudget(Long id) {
        Budget budget = budgetRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Budget not found"));
        budgetRepository.delete(budget);
    }

}
