
// for non-commercial meter

abstract class commonMethods{
    abstract void total_bill(int unit,double per_unit_rate, int per_elec_charges);
    abstract void unit_rate_cal();
}
class non_commercial_meter extends commonMethods{
   private int nonComm_unit;
    non_commercial_meter(int nonComm_unit){

        this.nonComm_unit=nonComm_unit;
    }
    @Override
    public void total_bill(int nonComm_unit,double per_unit_rate, int per_elec_charges){
        double unit_bill=nonComm_unit*per_unit_rate;
        System.out.println("Per Unit rate : "+per_unit_rate);
        System.out.println("Unit bill : "+unit_bill);
        System.out.println("Permanent electricity charges : "+per_elec_charges);
        System.out.println("Total bill : "+(unit_bill+per_elec_charges));
    }

    @Override
    public void unit_rate_cal(){

        int per_elec_charges=0;
        double per_unit_rate=0;
        if (nonComm_unit<=50){
        //          4.75;
            per_elec_charges=230;
            per_unit_rate=4.75;
            total_bill(nonComm_unit,per_unit_rate,per_elec_charges);

        } else if (nonComm_unit <=150) {
            //  6.50;
            per_elec_charges=230;
            per_unit_rate=6.50;
            total_bill(nonComm_unit,per_unit_rate,per_elec_charges);

        } else if (nonComm_unit <= 300) {
//           7.35;
            per_elec_charges=275;
            per_unit_rate=7.35;
            total_bill(nonComm_unit,per_unit_rate,per_elec_charges);

        } else if (nonComm_unit <=500) {
//            7.65;
            per_elec_charges=345;
            total_bill(nonComm_unit,per_unit_rate,per_elec_charges);

        } else if (nonComm_unit >=501) {
//            7.95;
            per_elec_charges=400;
            per_unit_rate=7.95;
            total_bill(nonComm_unit,per_unit_rate,per_elec_charges);

        }

    }
}

// For commercial meter

public class commercial_meter extends commonMethods {

  private int comm_unit;

    commercial_meter(int comm_unit){
        this.comm_unit=comm_unit;
    }
    @Override
    public void total_bill(int comm_unit,double per_unit_rate, int per_elec_charges){
        double unit_bill=comm_unit*per_unit_rate;
        System.out.println("Per Unit rate : "+per_unit_rate);
        System.out.println("Unit bill : "+unit_bill);
        System.out.println("Permanent electricity charges : "+per_elec_charges);
        System.out.println("Total bill : "+(unit_bill+per_elec_charges));
    }
    @Override
    public void unit_rate_cal(){
        int per_elec_charges=0;
        double per_unit_rate=0;
//        double unit_bill=0;
        if (comm_unit<=100){
            per_elec_charges=300;
            per_unit_rate=7.55;
//             7.55;
            total_bill( comm_unit, per_unit_rate, per_elec_charges);
        } else if (comm_unit <=200) {
            per_elec_charges=300;
            per_unit_rate=8.50;
//             8.50;
            total_bill( comm_unit, per_unit_rate, per_elec_charges);
        } else if (comm_unit <= 500) {
            per_elec_charges=380;
            per_unit_rate=8.85;
//             8.85;
            total_bill( comm_unit, per_unit_rate, per_elec_charges);
        } else if (comm_unit >=501) {
            per_elec_charges=460;
            per_unit_rate=8.95;
//            8.95;
            total_bill( comm_unit, per_unit_rate, per_elec_charges);
        }
    }


}
