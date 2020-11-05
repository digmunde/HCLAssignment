package com.hcl.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.hcl.model.Candidate;

public class ElectionService {
	public Candidate findWinner(List<Candidate> candidateList) {
		ElectionInt election = (candList) -> {
			return candList.stream()
					.sorted(Comparator.comparingInt(Candidate::getNoOfVotes).reversed()
							.thenComparing(Candidate::getFirstName).thenComparing(Candidate::getLastName)
							.thenComparing(Candidate::getDob))
					.collect(Collectors.toList()).get(0);
		};
		Candidate winner = election.evaliuateCandidate(candidateList);
		return winner;
	}
}
