package com.julyun123.book_management_mission.controller;

import com.julyun123.book_management_mission.repository.DashboardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class DashboardController {
    private final DashboardRepository dashboardRepository;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("count", dashboardRepository.count());

        return "dashboard";
    }
}
