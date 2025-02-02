/**
 * 
 */
package eu.fbk.iv4xr.mbt.execution;

import java.util.Collection;
import java.util.HashSet;

import eu.fbk.iv4xr.mbt.efsm.EFSMContext;
import eu.fbk.iv4xr.mbt.efsm.EFSMGuard;
import eu.fbk.iv4xr.mbt.efsm.EFSMOperation;
import eu.fbk.iv4xr.mbt.efsm.EFSMParameter;
import eu.fbk.iv4xr.mbt.efsm.EFSMState;
import eu.fbk.iv4xr.mbt.efsm.EFSMTransition;

//import eu.fbk.iv4xr.mbt.efsm4j.EFSMParameter;
//import eu.fbk.iv4xr.mbt.efsm4j.EFSMState;
//import eu.fbk.iv4xr.mbt.efsm4j.IEFSMContext;
//import eu.fbk.iv4xr.mbt.efsm4j.Transition;

/**
 * @author kifetew
 *
 */
public class ExecutionTrace<
	State extends EFSMState,
	InParameter extends EFSMParameter,
	OutParameter extends EFSMParameter,
	Context extends EFSMContext,
	Operation extends EFSMOperation,
	Guard extends EFSMGuard,
	Transition extends EFSMTransition<State, InParameter, OutParameter, Context, Operation, Guard>> {
	
	private Collection<State> coveredStates = new HashSet<State>();
	private Collection<Transition> coveredTransitions = new HashSet<Transition>();
	private boolean currentGoalCovered;
	
	private double pathBranchDistance;
	private double pathApproachLevel;
	
	private double targetBranchDistance;
	private double targetApproachLevel;
	
	private boolean success;
	
	/**
	 * 
	 */
	public ExecutionTrace() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the coveredStates
	 */
	public Collection<State> getCoveredStates() {
		return coveredStates;
	}

	/**
	 * @param coveredStates the coveredStates to set
	 */
	public void setCoveredStates(Collection<State> coveredStates) {
		this.coveredStates = coveredStates;
	}

	/**
	 * @return the coveredTransitions
	 */
	public Collection<Transition> getCoveredTransitions() {
		return coveredTransitions;
	}

	/**
	 * @param coveredTransitions the coveredTransitions to set
	 */
	public void setCoveredTransitions(Collection<Transition> coveredTransitions) {
		this.coveredTransitions = coveredTransitions;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the pathBranchDistance
	 */
	public double getPathBranchDistance() {
		return pathBranchDistance;
	}

	/**
	 * @param pathBranchDistance the pathBranchDistance to set
	 */
	public void setPathBranchDistance(double pathBranchDistance) {
		this.pathBranchDistance = pathBranchDistance;
	}

	/**
	 * @return the pathApproachLevel
	 */
	public double getPathApproachLevel() {
		return pathApproachLevel;
	}

	/**
	 * @param pathApproachLevel the pathApproachLevel to set
	 */
	public void setPathApproachLevel(double pathApproachLevel) {
		this.pathApproachLevel = pathApproachLevel;
	}

	/**
	 * @return the targetBranchDistance
	 */
	public double getTargetBranchDistance() {
		return targetBranchDistance;
	}

	/**
	 * @param targetBranchDistance the targetBranchDistance to set
	 */
	public void setTargetBranchDistance(double targetBranchDistance) {
		this.targetBranchDistance = targetBranchDistance;
	}

	/**
	 * @return the targetApproachLevel
	 */
	public double getTargetApproachLevel() {
		return targetApproachLevel;
	}

	/**
	 * @param targetApproachLevel the targetApproachLevel to set
	 */
	public void setTargetApproachLevel(double targetApproachLevel) {
		this.targetApproachLevel = targetApproachLevel;
	}

	/**
	 * @return the currentGoalCovered
	 */
	public boolean isCurrentGoalCovered() {
		return currentGoalCovered;
	}

	/**
	 * @param currentGoalCovered the currentGoalCovered to set
	 */
	public void setCurrentGoalCovered(boolean currentGoalCovered) {
		this.currentGoalCovered = currentGoalCovered;
	}

}
