package com;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        setContent(layout);

        String jsonData =
        "{" +
          "chart : " +
            "{renderTo : 'chart',}, " +
          "series : " +
          "[ " +
            "{" +
              "type : 'pie', " +
              "data : " +
              "[ " +
                  "[ '80后会员购买量.', 20 ], " +
                  "[ '70后会员购买量.', 35 ], " +
                  "[ '60后会员购买量.', 45 ] " +
              "] " +
            "} " +
          "] " +
        "}";
        Highcharts highchartsPie = new Highcharts();

        highchartsPie.setData(jsonData);
        highchartsPie.setId("chart");
        highchartsPie.setWidth("400px");
        highchartsPie.setHeight("300px");

        layout.addComponent(highchartsPie);
    }
}
