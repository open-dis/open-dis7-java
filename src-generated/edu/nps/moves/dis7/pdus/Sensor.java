/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * An entity's sensor information.  Section 6.2.77.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class Sensor extends Object implements Serializable
{
   /**  the source of the Sensor Type field  uid 414 */
   protected SensorTypeSource sensorTypeSource = SensorTypeSource.values()[0];

   /** The on/off status of the sensor uid 331 */
   protected SensorOnOffStatus sensorOnOffStatus = SensorOnOffStatus.values()[0];

   /** for Source 'other':SensorRecordOtherActiveSensors/325,'em':EmitterName/75,'passive':SensorRecordSensorTypePassiveSensors/326,'mine':6.2.57,'ua':UAAcousticSystemName/144,'lasers':DesignatorSystemName/80 */
   protected short  sensorType;

   /**  the station to which the sensor is assigned. A zero value shall indi- cate that this Sensor record is not associated with any particular station and represents the total quan- tity of this sensor for this entity. If this field is non-zero, it shall either reference an attached part or an articulated part */
   protected int  station;

   /** quantity of the sensor  */
   protected short  quantity;

   /** padding */
   protected short  padding = (short)0;


/** Constructor */
 public Sensor()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += sensorTypeSource.getMarshalledSize();
   marshalSize += sensorOnOffStatus.getMarshalledSize();
   marshalSize += 2;  // sensorType
   marshalSize += 4;  // station
   marshalSize += 2;  // quantity
   marshalSize += 2;  // padding

   return marshalSize;
}


/** Setter for {@link Sensor#sensorTypeSource}
  * @param pSensorTypeSource new value of interest
  * @return same object to permit progressive setters */
public Sensor setSensorTypeSource(SensorTypeSource pSensorTypeSource)
{
    sensorTypeSource = pSensorTypeSource;
    return this;
}

/** Getter for {@link Sensor#sensorTypeSource}
  * @return value of interest */
public SensorTypeSource getSensorTypeSource()
{
    return sensorTypeSource; 
}

/** Setter for {@link Sensor#sensorOnOffStatus}
  * @param pSensorOnOffStatus new value of interest
  * @return same object to permit progressive setters */
public Sensor setSensorOnOffStatus(SensorOnOffStatus pSensorOnOffStatus)
{
    sensorOnOffStatus = pSensorOnOffStatus;
    return this;
}

/** Getter for {@link Sensor#sensorOnOffStatus}
  * @return value of interest */
public SensorOnOffStatus getSensorOnOffStatus()
{
    return sensorOnOffStatus; 
}

/** Setter for {@link Sensor#sensorType}
  * @param pSensorType new value of interest
  * @return same object to permit progressive setters */
public Sensor setSensorType(short pSensorType)
{
    sensorType = pSensorType;
    return this;
}
/** Utility setter for {@link Sensor#sensorType}
  * @param pSensorType new value of interest
  * @return same object to permit progressive setters */
public Sensor setSensorType(int pSensorType){
    sensorType = (short) pSensorType;
    return this;
}

/** Getter for {@link Sensor#sensorType}
  * @return value of interest */
public short getSensorType()
{
    return sensorType; 
}

/** Setter for {@link Sensor#station}
  * @param pStation new value of interest
  * @return same object to permit progressive setters */
public Sensor setStation(int pStation)
{
    station = pStation;
    return this;
}

/** Getter for {@link Sensor#station}
  * @return value of interest */
public int getStation()
{
    return station; 
}

/** Setter for {@link Sensor#quantity}
  * @param pQuantity new value of interest
  * @return same object to permit progressive setters */
public Sensor setQuantity(short pQuantity)
{
    quantity = pQuantity;
    return this;
}
/** Utility setter for {@link Sensor#quantity}
  * @param pQuantity new value of interest
  * @return same object to permit progressive setters */
public Sensor setQuantity(int pQuantity){
    quantity = (short) pQuantity;
    return this;
}

/** Getter for {@link Sensor#quantity}
  * @return value of interest */
public short getQuantity()
{
    return quantity; 
}

/** Setter for {@link Sensor#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public Sensor setPadding(short pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link Sensor#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public Sensor setPadding(int pPadding){
    padding = (short) pPadding;
    return this;
}

/** Getter for {@link Sensor#padding}
  * @return value of interest */
public short getPadding()
{
    return padding; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       sensorTypeSource.marshal(dos);
       sensorOnOffStatus.marshal(dos);
       dos.writeShort(sensorType);
       dos.writeInt(station);
       dos.writeShort(quantity);
       dos.writeShort(padding);
    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Deserializes an object from a DataInputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataInputStream
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        sensorTypeSource = SensorTypeSource.unmarshalEnum(dis);
        uPosition += sensorTypeSource.getMarshalledSize();
        sensorOnOffStatus = SensorOnOffStatus.unmarshalEnum(dis);
        uPosition += sensorOnOffStatus.getMarshalledSize();
        sensorType = (short)dis.readUnsignedShort();
        uPosition += 2;
        station = dis.readInt();
        uPosition += 4;
        quantity = (short)dis.readUnsignedShort();
        uPosition += 2;
        padding = (short)dis.readUnsignedShort();
        uPosition += 2;
    }
    catch(Exception e)
    { 
      System.err.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if byteBuffer is too small
 * @throws java.nio.ReadOnlyBufferException if byteBuffer is read only
 * @see java.nio.ByteBuffer
 * @param byteBuffer The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   sensorTypeSource.marshal(byteBuffer);
   sensorOnOffStatus.marshal(byteBuffer);
   byteBuffer.putShort( (short)sensorType);
   byteBuffer.putInt( (int)station);
   byteBuffer.putShort( (short)quantity);
   byteBuffer.putShort( (short)padding);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    sensorTypeSource = SensorTypeSource.unmarshalEnum(byteBuffer);
    sensorOnOffStatus = SensorOnOffStatus.unmarshalEnum(byteBuffer);
    sensorType = (short)(byteBuffer.getShort() & 0xFFFF);
    station = byteBuffer.getInt();
    quantity = (short)(byteBuffer.getShort() & 0xFFFF);
    padding = (short)(byteBuffer.getShort() & 0xFFFF);
    return getMarshalledSize();
}

 /*
  * Override of default equals method.  Calls equalsImpl() for content comparison.
  */
@Override
 public boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(!getClass().isAssignableFrom(obj.getClass())) //if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final Sensor rhs = (Sensor)obj;

     if( ! (sensorTypeSource == rhs.sensorTypeSource)) ivarsEqual = false;
     if( ! (sensorOnOffStatus == rhs.sensorOnOffStatus)) ivarsEqual = false;
     if( ! (sensorType == rhs.sensorType)) ivarsEqual = false;
     if( ! (station == rhs.station)) ivarsEqual = false;
     if( ! (quantity == rhs.quantity)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" sensorTypeSource: ").append(sensorTypeSource).append("\n");
    sb.append(" sensorOnOffStatus: ").append(sensorOnOffStatus).append("\n");
    sb.append(" sensorType: ").append(sensorType).append("\n");
    sb.append(" station: ").append(station).append("\n");
    sb.append(" quantity: ").append(quantity).append("\n");
    sb.append(" padding: ").append(padding).append("\n");

   return sb.toString();
 }
} // end of class
