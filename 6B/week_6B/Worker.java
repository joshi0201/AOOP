package week_6B;

import java.util.Iterator;
import java.util.Objects;

public class Worker implements Comparable<Worker>, Cloneable, Iterable<Worker> {
	
	    private int workerId;
	    private String workerName;
	    private double wage;

	    public Worker(int workerId, String workerName, double wage) {
	        this.workerId = workerId;
	        this.workerName = workerName;
	        this.wage = wage;
	    }

	    public int getWorkerId() {
	        return workerId;
	    }

	    public void setWorkerId(int workerId) {
	        this.workerId = workerId;
	    }

	    public String getWorkerName() {
	        return workerName;
	    }

	    public void setWorkerName(String workerName) {
	        this.workerName = workerName;
	    }

	    public double getWage() {
	        return wage;
	    }

	    public void setWage(double wage) {
	        this.wage = wage;
	    }

	    @Override
	    public int compareTo(Worker other) {
	        return Integer.compare(this.workerId, other.workerId);
	    }

	    @Override
	    protected Worker clone() {
	        try {
	            return (Worker) super.clone();
	        } catch (CloneNotSupportedException e) {
	            throw new AssertionError("Cloning not supported", e);
	        }
	    }

	    @Override
	    public String toString() {
	        return "Worker{" +
	                "workerId=" + workerId +
	                ", workerName='" + workerName + '\'' +
	                ", wage=" + wage +
	                '}';
	    }

	    @Override
	    public Iterator<Worker> iterator() {
	        return new WorkerIterator(this);
	    }

	    private static class WorkerIterator implements Iterator<Worker> {
	        private Worker worker;

	        public WorkerIterator(Worker worker) {
	            this.worker = worker;
	        }

	        @Override
	        public boolean hasNext() {
	            return worker != null;
	        }

	        @Override
	        public Worker next() {
	            Worker current = worker;
	            worker = null;
	            return current;
	        }
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Worker worker = (Worker) o;
	        return workerId == worker.workerId && Double.compare(worker.wage, wage) == 0 && Objects.equals(workerName, worker.workerName);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(workerId, workerName, wage);
	    }
	}

