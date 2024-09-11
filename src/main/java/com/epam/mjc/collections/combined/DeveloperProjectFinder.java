package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developerProjects = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                developerProjects.add(entry.getKey());
            }
        }
        Collections.sort(developerProjects, new ProjectComparator());
        return developerProjects;
    }

    static class ProjectComparator implements Comparator<String> {
        public int compare(String o1, String o2) {
            if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            } else {
                return o2.compareTo(o1);
            }
        }
    }
}


