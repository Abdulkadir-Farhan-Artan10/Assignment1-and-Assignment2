abstract class Medical_service{
    String serviceId;
    String serviceName;
    double base_cost;
    //parametrize
    Medical_service(String serviceId,String serviceName,double base_cost){
        this.serviceId=serviceId;
        this.serviceName=serviceName;
        this.base_cost=base_cost;
    }
    //abstract method
    abstract double calculateTotal_cost();
    //cocrete method
    void display_serviceInfo(){
        System.out.println("Service ID:" +serviceId);
        System.out.println("Service Name:" +serviceName);
        System.out.println("Total Cost: $" +calculateTotal_cost());
        System.out.println();

    }

}
//consultation subclass
class consultation extends Medical_service{
    double doctor_fee;
    //constructor
    consultation(String serviceId,String serviceName,double base_cost,double doctor_fee){
        super(serviceId,serviceName,base_cost);
        this.doctor_fee=doctor_fee;
    }
    @Override
    double calculateTotal_cost(){
        return base_cost + doctor_fee;
    }

}
//laboratory_test subclass
class laboratory_test extends Medical_service{
    double test_charge;
    laboratory_test(String serviceId,String serviceName,double base_cost,double test_charge){
        super(serviceId,serviceName,base_cost);
        this.test_charge=test_charge;

    }
    @Override
    double calculateTotal_cost(){
        return base_cost+test_charge;
    }
}
//ultrasound subclass
class ultrasound extends Medical_service{
    double additional_fee;
    ultrasound(String serviceId,String serviceName,double base_cost,double additional_fee){
        super(serviceId,serviceName,base_cost);
        this.additional_fee=additional_fee;

    }
    @Override
    double calculateTotal_cost(){
        return base_cost+additional_fee;
    }

}

public class Hospital_billing_system {
    static void main() {
        Medical_service[] services={
                new consultation("101","Consultation",15,10),
                new laboratory_test("102","Laboratory Test",20,40),
                new ultrasound("102","Ultrasound",32,22)
        };
        double totalBill=0;
        System.out.println("====Hospital Billing System=====");
        System.out.println();
        for (Medical_service e:services){
            e.display_serviceInfo();
            totalBill+=e.calculateTotal_cost();

        }
        System.out.println("--------------------------------");
        System.out.println("Total Hospital Bill: $" +totalBill);


    }
}
