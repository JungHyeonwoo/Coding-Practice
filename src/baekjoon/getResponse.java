package baekjoon;

public class getResponse {

  public static void main(String[] args) throws Exception {
    String input = "Qos/state\n"
        + "Qos/classifiers/state\n"
        + "Qos/classifiers/classifier/terms/term/actions\n"
        + "Qos/classfiers/classfier/terms/term/actions/state\n"
        + "Qos/classfiers/classfier/terms/term/actions/remark/state\n"
        + "Qos/classfiers/classfier/terms/term/conditions/ipv4/state\n"
        + "Qos/classfiers/classfier/terms/term/conditions/ipv6/state\n"
        + "Qos/classfiers/classfier/terms/term/conditions/l2/state\n"
        + "Qos/classfiers/classfier/terms/term/conditions/mpls/state\n"
        + "Qos/classfiers/classfier/terms/term/conditions/transport/state\n"
        + "Qos/forwarding-groups/forwarding-group/state\n"
        + "Qos/interfaces/interface/state\n"
        + "qos/interfaces/interface/input/state\n"
        + "Qos/interfaces/interface/input/classfiers/classfier/state\n"
        + "Qos/interfaces/interface/input/classifiers/classifier/terms/term/id\n"
        + "qos/interfaces/interface/input/queues/queue/state\n"
        + "qos/interfaces/interface/input/scheduler-policy/state\n"
        + "qos/interfaces/interface/input/scheduler-policy/schedulers/scheduler/state\n"
        + "qos/interfaces/interface/input/virtual-ouptut-queues/voq-interface/state\n"
        + "Qos/interffaces/interface/input/virtual-output-queues/voq-interface/queues/queue/state\n"
        + "qos/interfaces/interface/interface-ref/state\n"
        + "Qos/interfaces/interface/output/state\n"
        + "qos/interfaces/interface/output/classifiers/classifier/state\n"
        + "qos/interfaces/interface/output/classifiers/classifier/terms/term/state\n"
        + "Qos/interfaces/interface/output/interface-ref/state\n"
        + "qos/interfaces/interface/output/pfc/state\n"
        + "Qos/interfaces/interface/output/queues/queue/state\n"
        + "Qos/interfaces/interface/output/scheduler-policy/state\n"
        + "qos/interfaces/interface/output/scheduler-policy/schedulers/scheduler/state\n"
        + "Qos/pfc/watchdog/state\n"
        + "Qos/queues/queue/state\n"
        + "Qos/queues/queue/ecn/state\n"
        + "Qos/queues/queue/red/state\n"
        + "Qos/queues/queue/wred/state\n"
        + "qos/scheduler-policies/scheduler-policy/state\n"
        + "qos/scheduler-policies/scheduler-policy/schedulers/scheduler/state\n"
        + "Qos/scheduler-policies/scheduler-policy/schedulers/scheduler/inputs/input/state\n"
        + "Qos/scheduler-policies/scheduler-policy/schedulers/scheduler/one-rate-two-color/state\n"
        + "qos/scheduler-policies/scheduler-policy/schedulers/scheduler/one-rate-two-color/conform-action\n"
        + "Qos/scheduler-policies/scheduler-policy/schedulers/scheduler/one-rate-two-color/exceed-action/state\n"
        + "Qos/scheduler-policies/sceduler-policy/schedulers/scheduler/output/state\n"
        + "Qos/scheduler-policies/scheduler-policy/schedulers/scheduler/two-rate-three-color/state\n"
        + "Qos/scheduler-policies/scheduler-policy/schedulers/scheduler/two-rate-three-color/conform-action/state\n"
        + "qos/scheduler-policies/scheduler-policy/schedulers/scheduler/two-rate-three-color/exceed-action/state\n"
        + "qos/scheduler-policies/scheduler-policy/schedulers/scheduler/two-rate-three-color/violate-action/state";
    String[] inputArray = input.split("\n");
    for (int i = 0; i < inputArray.length; i++) {
      System.out.println(i + ". " + inputArray[i]);
    }
    System.out.println(inputArray.length);
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < inputArray.length; i++) {
      output.append("getRequest = GetRequest.newBuilder()\n"
              + "        .addPath(PathConverter.xPath2Path(\"").append(inputArray[i]).append("\"))\n")
          .append("        .build();\n")
          .append("    list.add(new SwitchCmd(\"gNMI\", getRequest));");
      output.append("\n");
      output.append("\n");
    }
    System.out.println("output = " + output);
  }
}