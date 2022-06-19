package baekjoon;

public class getResponse {

  public static void main(String[] args) throws Exception {
    String input = "Routing-policy/defined-sets/bgp-defined-sets/as-path-sets/as-path/set/state\n"
        + "Routing-policy/defined-sets/bgp-defined-sets/community-sets/community-set/state\n"
        + "Routing-policy/defined-sets/bgp-defined-sets/ext-community-sets/ext-community-set/state\n"
        + "Routing-policy/defined-sets/neighbor-sets/neighbor-set/state\n"
        + "Routing-policy/defined-sets/prefix-sets/prefix-set/state\n"
        + "routing-policy/defined-sets/prefix-sets/prefix-set/prefixes/prefix/state\n"
        + "routing-policy/defined-sets/tag-sets/tag-set/state\n"
        + "routing-policy/policy-definitions/policy-definition/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-as-path-prepend/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-community/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-community/inline/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-community/reference/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-ext-community/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-ext-community/inline/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-ext-community/reference/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/ospf-actions/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/ospf-actions/set-metric/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/bgp-conditions/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/bgp-conditions/as-path-length/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/bgp-conditions/community-count/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/bgp-conditions/match-as-path-set/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/match-interface/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/match-neighbor-set/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/match-prefix-set/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/match-tag-set/state\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/ospf-conditions/state";
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