/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.12.4.4 Serves the same function as the Start/Resume PDU but with the addition of reliability service levels
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class StartResumeRPdu extends SimulationManagementWithReliabilityFamilyPdu implements Serializable
{
   /** time in real world for this operation to happen */
   protected ClockTime  realWorldTime = new ClockTime(); 

   /** time in simulation for the simulation to resume */
   protected ClockTime  simulationTime = new ClockTime(); 

   /** level of reliability service used for this transaction uid 74 */
   protected RequiredReliabilityService requiredReliabilityService = RequiredReliabilityService.values()[0];

   /** pad1 is an undescribed parameter... */
   protected byte  pad1;

   /** pad2 is an undescribed parameter... */
   protected short  pad2;

   /** Request ID */
   protected int  requestID;


/** Constructor */
 public StartResumeRPdu()
 {
    setPduType( DISPDUType.START_RESUME_RELIABLE );
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += realWorldTime.getMarshalledSize();
   marshalSize += simulationTime.getMarshalledSize();
   marshalSize += requiredReliabilityService.getMarshalledSize();
   marshalSize += 1;  // pad1
   marshalSize += 2;  // pad2
   marshalSize += 4;  // requestID

   return marshalSize;
}


/** Setter for {@link StartResumeRPdu#realWorldTime}
  * @param pRealWorldTime new value of interest
  * @return same object to permit progressive setters */
public StartResumeRPdu setRealWorldTime(ClockTime pRealWorldTime)
{
    realWorldTime = pRealWorldTime;
    return this;
}

/** Getter for {@link StartResumeRPdu#realWorldTime}
  * @return value of interest */
public ClockTime getRealWorldTime()
{
    return realWorldTime; 
}

/** Setter for {@link StartResumeRPdu#simulationTime}
  * @param pSimulationTime new value of interest
  * @return same object to permit progressive setters */
public StartResumeRPdu setSimulationTime(ClockTime pSimulationTime)
{
    simulationTime = pSimulationTime;
    return this;
}

/** Getter for {@link StartResumeRPdu#simulationTime}
  * @return value of interest */
public ClockTime getSimulationTime()
{
    return simulationTime; 
}

/** Setter for {@link StartResumeRPdu#requiredReliabilityService}
  * @param pRequiredReliabilityService new value of interest
  * @return same object to permit progressive setters */
public StartResumeRPdu setRequiredReliabilityService(RequiredReliabilityService pRequiredReliabilityService)
{
    requiredReliabilityService = pRequiredReliabilityService;
    return this;
}

/** Getter for {@link StartResumeRPdu#requiredReliabilityService}
  * @return value of interest */
public RequiredReliabilityService getRequiredReliabilityService()
{
    return requiredReliabilityService; 
}

/** Setter for {@link StartResumeRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public StartResumeRPdu setPad1(byte pPad1)
{
    pad1 = pPad1;
    return this;
}
/** Utility setter for {@link StartResumeRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public StartResumeRPdu setPad1(int pPad1){
    pad1 = (byte) pPad1;
    return this;
}

/** Getter for {@link StartResumeRPdu#pad1}
  * @return value of interest */
public byte getPad1()
{
    return pad1; 
}

/** Setter for {@link StartResumeRPdu#pad2}
  * @param pPad2 new value of interest
  * @return same object to permit progressive setters */
public StartResumeRPdu setPad2(short pPad2)
{
    pad2 = pPad2;
    return this;
}
/** Utility setter for {@link StartResumeRPdu#pad2}
  * @param pPad2 new value of interest
  * @return same object to permit progressive setters */
public StartResumeRPdu setPad2(int pPad2){
    pad2 = (short) pPad2;
    return this;
}

/** Getter for {@link StartResumeRPdu#pad2}
  * @return value of interest */
public short getPad2()
{
    return pad2; 
}

/** Setter for {@link StartResumeRPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public StartResumeRPdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}

/** Getter for {@link StartResumeRPdu#requestID}
  * @return value of interest */
public int getRequestID()
{
    return requestID; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       realWorldTime.marshal(dos);
       simulationTime.marshal(dos);
       requiredReliabilityService.marshal(dos);
       dos.writeByte(pad1);
       dos.writeShort(pad2);
       dos.writeInt(requestID);
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
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += realWorldTime.unmarshal(dis);
        uPosition += simulationTime.unmarshal(dis);
        requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(dis);
        uPosition += requiredReliabilityService.getMarshalledSize();
        pad1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        pad2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        requestID = dis.readInt();
        uPosition += 4;
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
   super.marshal(byteBuffer);
   realWorldTime.marshal(byteBuffer);
   simulationTime.marshal(byteBuffer);
   requiredReliabilityService.marshal(byteBuffer);
   byteBuffer.put( (byte)pad1);
   byteBuffer.putShort( (short)pad2);
   byteBuffer.putInt( (int)requestID);
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
    super.unmarshal(byteBuffer);

    realWorldTime.unmarshal(byteBuffer);
    simulationTime.unmarshal(byteBuffer);
    requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(byteBuffer);
    pad1 = (byte)(byteBuffer.get() & 0xFF);
    pad2 = (short)(byteBuffer.getShort() & 0xFFFF);
    requestID = byteBuffer.getInt();
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

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final StartResumeRPdu rhs = (StartResumeRPdu)obj;

     if( ! (realWorldTime.equals( rhs.realWorldTime) )) ivarsEqual = false;
     if( ! (simulationTime.equals( rhs.simulationTime) )) ivarsEqual = false;
     if( ! (requiredReliabilityService == rhs.requiredReliabilityService)) ivarsEqual = false;
     if( ! (pad1 == rhs.pad1)) ivarsEqual = false;
     if( ! (pad2 == rhs.pad2)) ivarsEqual = false;
     if( ! (requestID == rhs.requestID)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" realWorldTime: ").append(realWorldTime).append("\n");
    sb.append(" simulationTime: ").append(simulationTime).append("\n");
    sb.append(" requiredReliabilityService: ").append(requiredReliabilityService).append("\n");
    sb.append(" pad1: ").append(pad1).append("\n");
    sb.append(" pad2: ").append(pad2).append("\n");
    sb.append(" requestID: ").append(requestID).append("\n");

   return sb.toString();
 }
} // end of class
