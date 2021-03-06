package edu.tuc.taxieinstiegstatistik.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
/**
 * 
 * Klasse zur erzeugung der XML Tag-Struktur.
 * Die Placemark Klasse erzeugt das vierte (ohne <Folder><name>) XML-Tag Element.
 * zusaetzlich beinhaelt das Placemark Tag die Tags <name> und <Magnitude> 
 * inklusive Werte:
 * 
 * <kml> 		
 * 	<Document>
 * 		<Folder>		
 * 			<name></name>
 * 			 <Placemark> 	<=====
 * 			  <name></name>
 * 			  <magnitude></magnitude>
 * 			  <Point>
 * 				<coordinates></coordinates> 
 *			  </Point>
 *			</Placemark> 	<=====
 *		</Folder>		
 *	 </Document>
 * </kml>
 */

@XmlType(propOrder = {"name", "magnitude", "point"})

public class Placemark {

    private String name = "";
    private String magnitude = "45.0";
    private Point point;

    public Point getPoint() {
        return point;
    }

    @XmlElement(name = "Point")
    public void setPoint(Point point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }
    @XmlElement(name = "name")
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getMagnitude() {
        return magnitude;
    }
    @XmlElement(name = "magnitude")
    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }


}