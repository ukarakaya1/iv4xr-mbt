/**
 * 
 */
package eu.fbk.iv4xr.mbt.coverage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import eu.fbk.iv4xr.mbt.MBTProperties;
import eu.fbk.iv4xr.mbt.efsm.EFSM;
import eu.fbk.iv4xr.mbt.efsm.EFSMContext;
import eu.fbk.iv4xr.mbt.efsm.EFSMFactory;
import eu.fbk.iv4xr.mbt.efsm.EFSMGuard;
import eu.fbk.iv4xr.mbt.efsm.EFSMOperation;
import eu.fbk.iv4xr.mbt.efsm.EFSMParameter;
import eu.fbk.iv4xr.mbt.efsm.EFSMState;
import eu.fbk.iv4xr.mbt.efsm.EFSMTransition;

/**
 * @author kifetew
 *
 */
public class TransitionCoverageGoalFactory<
	State extends EFSMState,
	InParameter extends EFSMParameter,
	OutParameter extends EFSMParameter,
	Context extends EFSMContext,
	Operation extends EFSMOperation,
	Guard extends EFSMGuard,
	Transition extends EFSMTransition<State, InParameter, OutParameter, Context, Operation, Guard>> 
		implements CoverageGoalFactory<TransitionCoverageGoal<State, InParameter, OutParameter, Context, Operation, Guard, Transition>> {

	List<TransitionCoverageGoal<State, InParameter, OutParameter, Context, Operation, Guard, Transition>> coverageGoals = new ArrayList<TransitionCoverageGoal<State, InParameter, OutParameter, Context, Operation, Guard, Transition>>();

	/**
	 * 
	 */
	public TransitionCoverageGoalFactory() {
		// build the list of coverage goals
		EFSM<State, InParameter, OutParameter, Context, Operation, Guard, Transition> model = EFSMFactory.getInstance().getEFSM();
		Set<EFSMTransition> transitions = model.getTransitons();
		if (transitions == null || transitions.isEmpty()) {
			throw new RuntimeException("Something wrong with the model: " + MBTProperties.SUT_EFSM + ". No transitions.");
		}
		for (EFSMTransition transition : transitions) {
			TransitionCoverageGoal<State, InParameter, OutParameter, Context, Operation, Guard, Transition> goal = 
						new TransitionCoverageGoal<State, InParameter, OutParameter, Context, Operation, Guard, Transition>((Transition) transition);
			coverageGoals.add(goal);
		}
	}

	@Override
	public List<TransitionCoverageGoal<State, InParameter, OutParameter, Context, Operation, Guard, Transition>> getCoverageGoals() {
		return coverageGoals;
	}

	@Override
	public boolean isMaximizationFunction() {
		return false;
	}



}
