/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.12.4.14 Used to communicate a request for data in record format.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class RecordQueryRPdu extends SimulationManagementWithReliabilityFamilyPdu implements Serializable
{
   /** request ID */
   protected int  requestID;

   /** level of reliability service used for this transaction uid 74 */
   protected RequiredReliabilityService requiredReliabilityService = RequiredReliabilityService.values()[0];

   /** padding */
   protected byte  pad1;

   /** event type uid 334 */
   protected RecordQueryREventType eventType = RecordQueryREventType.values()[0];

   /** time */
   protected int  time;

   /** numberOfRecords */
   protected int  numberOfRecords;

   /** record IDs */
   protected List< RecordQuerySpecification > recordIDs = new ArrayList< RecordQuerySpecification >();
 

/** Constructor */
 public RecordQueryRPdu()
 {
    setPduType( DISPDUType.RECORD_QUERY_RELIABLE );
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
   marshalSize += 4;  // requestID
   marshalSize += requiredReliabilityService.getMarshalledSize();
   marshalSize += 1;  // pad1
   marshalSize += eventType.getMarshalledSize();
   marshalSize += 4;  // time
   marshalSize += 4;  // numberOfRecords
   for(int idx=0; idx < recordIDs.size(); idx++)
   {
        RecordQuerySpecification listElement = recordIDs.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link RecordQueryRPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public RecordQueryRPdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}

/** Getter for {@link RecordQueryRPdu#requestID}
  * @return value of interest */
public int getRequestID()
{
    return requestID; 
}

/** Setter for {@link RecordQueryRPdu#requiredReliabilityService}
  * @param pRequiredReliabilityService new value of interest
  * @return same object to permit progressive setters */
public RecordQueryRPdu setRequiredReliabilityService(RequiredReliabilityService pRequiredReliabilityService)
{
    requiredReliabilityService = pRequiredReliabilityService;
    return this;
}

/** Getter for {@link RecordQueryRPdu#requiredReliabilityService}
  * @return value of interest */
public RequiredReliabilityService getRequiredReliabilityService()
{
    return requiredReliabilityService; 
}

/** Setter for {@link RecordQueryRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public RecordQueryRPdu setPad1(byte pPad1)
{
    pad1 = pPad1;
    return this;
}
/** Utility setter for {@link RecordQueryRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public RecordQueryRPdu setPad1(int pPad1){
    pad1 = (byte) pPad1;
    return this;
}

/** Getter for {@link RecordQueryRPdu#pad1}
  * @return value of interest */
public byte getPad1()
{
    return pad1; 
}

/** Setter for {@link RecordQueryRPdu#eventType}
  * @param pEventType new value of interest
  * @return same object to permit progressive setters */
public RecordQueryRPdu setEventType(RecordQueryREventType pEventType)
{
    eventType = pEventType;
    return this;
}

/** Getter for {@link RecordQueryRPdu#eventType}
  * @return value of interest */
public RecordQueryREventType getEventType()
{
    return eventType; 
}

/** Setter for {@link RecordQueryRPdu#time}
  * @param pTime new value of interest
  * @return same object to permit progressive setters */
public RecordQueryRPdu setTime(int pTime)
{
    time = pTime;
    return this;
}

/** Getter for {@link RecordQueryRPdu#time}
  * @return value of interest */
public int getTime()
{
    return time; 
}

/** Setter for {@link RecordQueryRPdu#recordIDs}
  * @param pRecordIDs new value of interest
  * @return same object to permit progressive setters */
public RecordQueryRPdu setRecordIDs(List<RecordQuerySpecification> pRecordIDs)
{
    recordIDs = pRecordIDs;
    return this;
}

/** Getter for {@link RecordQueryRPdu#recordIDs}
  * @return value of interest */
public List<RecordQuerySpecification> getRecordIDs()
{
    return recordIDs; 
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
       dos.writeInt(requestID);
       requiredReliabilityService.marshal(dos);
       dos.writeByte(pad1);
       eventType.marshal(dos);
       dos.writeInt(time);
       dos.writeInt(recordIDs.size());

       for(int idx = 0; idx < recordIDs.size(); idx++)
       {
            RecordQuerySpecification aRecordQuerySpecification = recordIDs.get(idx);
            aRecordQuerySpecification.marshal(dos);
       }

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
        requestID = dis.readInt();
        uPosition += 4;
        requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(dis);
        uPosition += requiredReliabilityService.getMarshalledSize();
        pad1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        eventType = RecordQueryREventType.unmarshalEnum(dis);
        uPosition += eventType.getMarshalledSize();
        time = dis.readInt();
        uPosition += 4;
        numberOfRecords = dis.readInt();
        uPosition += 4;
        for(int idx = 0; idx < numberOfRecords; idx++)
        {
            RecordQuerySpecification anX = new RecordQuerySpecification();
            uPosition += anX.unmarshal(dis);
            recordIDs.add(anX);
        }

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
   byteBuffer.putInt( (int)requestID);
   requiredReliabilityService.marshal(byteBuffer);
   byteBuffer.put( (byte)pad1);
   eventType.marshal(byteBuffer);
   byteBuffer.putInt( (int)time);
   byteBuffer.putInt( (int)recordIDs.size());

   for(int idx = 0; idx < recordIDs.size(); idx++)
   {
        RecordQuerySpecification aRecordQuerySpecification = recordIDs.get(idx);
        aRecordQuerySpecification.marshal(byteBuffer);
   }

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

    requestID = byteBuffer.getInt();
    requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(byteBuffer);
    pad1 = (byte)(byteBuffer.get() & 0xFF);
    eventType = RecordQueryREventType.unmarshalEnum(byteBuffer);
    time = byteBuffer.getInt();
    numberOfRecords = byteBuffer.getInt();
    for(int idx = 0; idx < numberOfRecords; idx++)
    {
    RecordQuerySpecification anX = new RecordQuerySpecification();
    anX.unmarshal(byteBuffer);
    recordIDs.add(anX);
    }

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

     final RecordQueryRPdu rhs = (RecordQueryRPdu)obj;

     if( ! (requestID == rhs.requestID)) ivarsEqual = false;
     if( ! (requiredReliabilityService == rhs.requiredReliabilityService)) ivarsEqual = false;
     if( ! (pad1 == rhs.pad1)) ivarsEqual = false;
     if( ! (eventType == rhs.eventType)) ivarsEqual = false;
     if( ! (time == rhs.time)) ivarsEqual = false;

     for(int idx = 0; idx < recordIDs.size(); idx++)
        if( ! ( recordIDs.get(idx).equals(rhs.recordIDs.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" requestID: ").append(requestID).append("\n");
    sb.append(" requiredReliabilityService: ").append(requiredReliabilityService).append("\n");
    sb.append(" pad1: ").append(pad1).append("\n");
    sb.append(" eventType: ").append(eventType).append("\n");
    sb.append(" time: ").append(time).append("\n");
    sb.append(" recordIDs: ").append("\n");
    recordIDs.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
