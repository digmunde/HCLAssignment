package com.hcl.service;

import java.util.List;

import com.hcl.model.Candidate;

@FunctionalInterface
public interface ElectionInt {
	Candidate evaliuateCandidate(List<Candidate> candidateList);
}
