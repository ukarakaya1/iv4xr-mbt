/**
 * 
 */
package eu.fbk.iv4xr.mbt.coverage;

import org.evosuite.ga.Chromosome;
import org.evosuite.ga.FitnessFunction;

import eu.fbk.iv4xr.mbt.efsm.EFSMContext;
import eu.fbk.iv4xr.mbt.efsm.EFSMGuard;
import eu.fbk.iv4xr.mbt.efsm.EFSMOperation;
import eu.fbk.iv4xr.mbt.efsm.EFSMParameter;
import eu.fbk.iv4xr.mbt.efsm.EFSMPath;
import eu.fbk.iv4xr.mbt.efsm.EFSMState;
import eu.fbk.iv4xr.mbt.efsm.EFSMTransition;
//import eu.fbk.iv4xr.mbt.efsm4j.EFSMParameter;
//import eu.fbk.iv4xr.mbt.efsm4j.EFSMState;
//import eu.fbk.iv4xr.mbt.efsm4j.IEFSMContext;
import eu.fbk.iv4xr.mbt.execution.ExecutionResult;
import eu.fbk.iv4xr.mbt.testcase.Testcase;

/**
 * @author kifetew
 *
 */
public class PathCoverageGoal<
	State extends EFSMState,
	InParameter extends EFSMParameter,
	OutParameter extends EFSMParameter,
	Context extends EFSMContext,
	Operation extends EFSMOperation,
	Guard extends EFSMGuard,
	Transition extends EFSMTransition<State, InParameter, OutParameter, Context, Operation, Guard>> 
		extends CoverageGoal<State, InParameter, OutParameter, Context, Operation, Guard, Transition> {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 8117932676170582125L;

	
	private EFSMPath path;
	
	/**
	 * 
	 */
	public PathCoverageGoal(EFSMPath p) {
		path = p;
	}

	@Override
	public double getFitness(Chromosome individual) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isMaximizationFunction() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (! (obj instanceof PathCoverageGoal)) {
			return false;
		}
		
		PathCoverageGoal other = (PathCoverageGoal)obj;
		return path.equals(other.path);
		
	}

	@Override
	public int hashCode() {
		return path.hashCode();
	}

	@Override
	protected void updateCollateralCoverage(Chromosome individual, ExecutionResult executionResult) {
		// collateral coverage only if the individual is valid
		if (executionResult.isSuccess()) {
			// collect colateral coverage
		}
	}

	

}
