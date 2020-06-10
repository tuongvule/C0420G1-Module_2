package d_class_and_object_in_java.Excercise;

public class XayDungLopStopWatch {
    public static class StopWatch{
        private long startTime;
        private long endTime;
        public StopWatch(){
            this.startTime = System.currentTimeMillis();
        }
        public long getStartTime(){
            return startTime;
        }
        public long getEndTime(){
            return endTime;
        }
        public long start(){
            return this.startTime = System.currentTimeMillis();
        }
        public long stop(){
            return this.endTime = System.currentTimeMillis();
        }
        public long getElapsedTime(){
            return this.endTime - this.startTime;
        }
        public void setEndTime(long endTime){
            this.endTime = endTime;
        }
        public void display(){
            System.out.println(this.startTime);
        }

        public static void main(String[] args) {
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            for(int i=0;i<100000;i++){
                System.out.println(i + "; ");
            }
            stopWatch.stop();
            System.out.println(stopWatch.getElapsedTime());
        }
    }
}
