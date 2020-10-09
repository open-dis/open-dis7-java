/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * The Angle Deception attribute record may be used to communicate discrete values that are associated with angle deception jamming that cannot be referenced to an emitter mode. The values provided in the record records (provided in the associated Electromagnetic Emission PDU). (The victim radar beams are those that are targeted by the jammer.) Section 6.2.21.2.2
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class AngleDeception extends Object implements Serializable
{
   /** record type */
   protected int  recordType = (int)3501;

   /** The length of the record in octets. */
   protected short  recordLength = (short)48;

   /** padding */
   protected short  padding = (short)0;

   /** indicates the emitter system for which the angle deception values are applicable.  */
   protected byte  emitterNumber;

   /** indicates the jamming beam for which the angle deception values are applicable. */
   protected byte  beamNumber;

   /** This field shall be used to indicate if angle deception data have changed since issuance of the last Angle Deception attribute record for this beam, if the Angle Deception attribute record is part of a heartbeat update to meet periodic update requirements or if the angle deception data for the beam has ceased. uid 300 */
   protected EEAttributeStateIndicator stateIndicator = EEAttributeStateIndicator.values()[0];

   /** padding */
   protected byte  padding2 = (byte)0;

   /** This field indicates the relative azimuth angle at which the deceptive radar returns are centered. This angle is measured in the X-Y plane of the victim radar's entity coordinate system (see 1.4.3). This angle is measured in radians from the victim radar entity's azimuth for the true jam- mer position to the center of the range of azimuths in which deceptive radar returns are perceived as shown in Figure 43. Positive and negative values indicate that the perceived positions of the jammer are right and left of the true position of the jammer, respectively. The range of permissible values is -PI to PI */
   protected float  azimuthOffset;

   /** indicates the range of azimuths (in radians) through which the deceptive radar returns are perceived, centered on the azimuth offset as shown in Figure 43. The range of permissible values is 0 to 2PI radians */
   protected float  azimuthWidth;

   /** This field indicates the rate (in radians per second) at which the Azimuth Offset value is changing. Positive and negative values indicate that the Azimuth Offset is moving to the right or left, respectively. */
   protected float  azimuthPullRate;

   /** This field indicates the rate (in radians per second squared) at which the Azimuth Pull Rate value is changing. Azimuth Pull Acceleration is defined as positive to the right and negative to the left. */
   protected float  azimuthPullAcceleration;

   /** This field indicates the relative elevation angle at which the deceptive radar returns begin. This angle is measured as an angle with respect to the X-Y plane of the victim radar's entity coordinate system (see 1.4.3). This angle is measured in radians from the victim radar entity's eleva- tion for the true jammer position to the center of the range of elevations in which deceptive radar returns are perceived as shown in Figure 44. Positive and negative values indicate that the perceived positions of the jammer are above and below the true position of the jammer, respectively. The range of permissible values is -PI/2 to PI/2 */
   protected float  elevationOffset;

   /** This field indicates the range of elevations (in radians) through which the decep- tive radar returns are perceived, centered on the elevation offset as shown in Figure 44. The range of permissible values is 0 to PI radians */
   protected float  elevationWidth;

   /** This field indicates the rate (in radians per second) at which the Elevation Off- set value is changing. Positive and negative values indicate that the Elevation Offset is moving up or down, respectively.  */
   protected float  elevationPullRate;

   /** This field indicates the rate (in radians per second squared) at which the Elevation Pull Rate value is changing. Elevation Pull Acceleration is defined as positive to upward and negative downward.  */
   protected float  elevationPullAcceleration;

   /**  */
   protected int  padding3 = (int)0;


/** Constructor */
 public AngleDeception()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 4;  // recordType
   marshalSize += 2;  // recordLength
   marshalSize += 2;  // padding
   marshalSize += 1;  // emitterNumber
   marshalSize += 1;  // beamNumber
   marshalSize += stateIndicator.getMarshalledSize();
   marshalSize += 1;  // padding2
   marshalSize += 4;  // azimuthOffset
   marshalSize += 4;  // azimuthWidth
   marshalSize += 4;  // azimuthPullRate
   marshalSize += 4;  // azimuthPullAcceleration
   marshalSize += 4;  // elevationOffset
   marshalSize += 4;  // elevationWidth
   marshalSize += 4;  // elevationPullRate
   marshalSize += 4;  // elevationPullAcceleration
   marshalSize += 4;  // padding3

   return marshalSize;
}


/** Setter for {@link AngleDeception#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setRecordType(int pRecordType)
{
    recordType = pRecordType;
    return this;
}

/** Getter for {@link AngleDeception#recordType}
  * @return value of interest */
public int getRecordType()
{
    return recordType; 
}

/** Setter for {@link AngleDeception#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setRecordLength(short pRecordLength)
{
    recordLength = pRecordLength;
    return this;
}
/** Utility setter for {@link AngleDeception#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setRecordLength(int pRecordLength){
    recordLength = (short) pRecordLength;
    return this;
}

/** Getter for {@link AngleDeception#recordLength}
  * @return value of interest */
public short getRecordLength()
{
    return recordLength; 
}

/** Setter for {@link AngleDeception#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setPadding(short pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link AngleDeception#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setPadding(int pPadding){
    padding = (short) pPadding;
    return this;
}

/** Getter for {@link AngleDeception#padding}
  * @return value of interest */
public short getPadding()
{
    return padding; 
}

/** Setter for {@link AngleDeception#emitterNumber}
  * @param pEmitterNumber new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setEmitterNumber(byte pEmitterNumber)
{
    emitterNumber = pEmitterNumber;
    return this;
}
/** Utility setter for {@link AngleDeception#emitterNumber}
  * @param pEmitterNumber new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setEmitterNumber(int pEmitterNumber){
    emitterNumber = (byte) pEmitterNumber;
    return this;
}

/** Getter for {@link AngleDeception#emitterNumber}
  * @return value of interest */
public byte getEmitterNumber()
{
    return emitterNumber; 
}

/** Setter for {@link AngleDeception#beamNumber}
  * @param pBeamNumber new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setBeamNumber(byte pBeamNumber)
{
    beamNumber = pBeamNumber;
    return this;
}
/** Utility setter for {@link AngleDeception#beamNumber}
  * @param pBeamNumber new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setBeamNumber(int pBeamNumber){
    beamNumber = (byte) pBeamNumber;
    return this;
}

/** Getter for {@link AngleDeception#beamNumber}
  * @return value of interest */
public byte getBeamNumber()
{
    return beamNumber; 
}

/** Setter for {@link AngleDeception#stateIndicator}
  * @param pStateIndicator new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setStateIndicator(EEAttributeStateIndicator pStateIndicator)
{
    stateIndicator = pStateIndicator;
    return this;
}

/** Getter for {@link AngleDeception#stateIndicator}
  * @return value of interest */
public EEAttributeStateIndicator getStateIndicator()
{
    return stateIndicator; 
}

/** Setter for {@link AngleDeception#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setPadding2(byte pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link AngleDeception#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setPadding2(int pPadding2){
    padding2 = (byte) pPadding2;
    return this;
}

/** Getter for {@link AngleDeception#padding2}
  * @return value of interest */
public byte getPadding2()
{
    return padding2; 
}

/** Setter for {@link AngleDeception#azimuthOffset}
  * @param pAzimuthOffset new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setAzimuthOffset(float pAzimuthOffset)
{
    azimuthOffset = pAzimuthOffset;
    return this;
}

/** Getter for {@link AngleDeception#azimuthOffset}
  * @return value of interest */
public float getAzimuthOffset()
{
    return azimuthOffset; 
}

/** Setter for {@link AngleDeception#azimuthWidth}
  * @param pAzimuthWidth new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setAzimuthWidth(float pAzimuthWidth)
{
    azimuthWidth = pAzimuthWidth;
    return this;
}

/** Getter for {@link AngleDeception#azimuthWidth}
  * @return value of interest */
public float getAzimuthWidth()
{
    return azimuthWidth; 
}

/** Setter for {@link AngleDeception#azimuthPullRate}
  * @param pAzimuthPullRate new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setAzimuthPullRate(float pAzimuthPullRate)
{
    azimuthPullRate = pAzimuthPullRate;
    return this;
}

/** Getter for {@link AngleDeception#azimuthPullRate}
  * @return value of interest */
public float getAzimuthPullRate()
{
    return azimuthPullRate; 
}

/** Setter for {@link AngleDeception#azimuthPullAcceleration}
  * @param pAzimuthPullAcceleration new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setAzimuthPullAcceleration(float pAzimuthPullAcceleration)
{
    azimuthPullAcceleration = pAzimuthPullAcceleration;
    return this;
}

/** Getter for {@link AngleDeception#azimuthPullAcceleration}
  * @return value of interest */
public float getAzimuthPullAcceleration()
{
    return azimuthPullAcceleration; 
}

/** Setter for {@link AngleDeception#elevationOffset}
  * @param pElevationOffset new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setElevationOffset(float pElevationOffset)
{
    elevationOffset = pElevationOffset;
    return this;
}

/** Getter for {@link AngleDeception#elevationOffset}
  * @return value of interest */
public float getElevationOffset()
{
    return elevationOffset; 
}

/** Setter for {@link AngleDeception#elevationWidth}
  * @param pElevationWidth new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setElevationWidth(float pElevationWidth)
{
    elevationWidth = pElevationWidth;
    return this;
}

/** Getter for {@link AngleDeception#elevationWidth}
  * @return value of interest */
public float getElevationWidth()
{
    return elevationWidth; 
}

/** Setter for {@link AngleDeception#elevationPullRate}
  * @param pElevationPullRate new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setElevationPullRate(float pElevationPullRate)
{
    elevationPullRate = pElevationPullRate;
    return this;
}

/** Getter for {@link AngleDeception#elevationPullRate}
  * @return value of interest */
public float getElevationPullRate()
{
    return elevationPullRate; 
}

/** Setter for {@link AngleDeception#elevationPullAcceleration}
  * @param pElevationPullAcceleration new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setElevationPullAcceleration(float pElevationPullAcceleration)
{
    elevationPullAcceleration = pElevationPullAcceleration;
    return this;
}

/** Getter for {@link AngleDeception#elevationPullAcceleration}
  * @return value of interest */
public float getElevationPullAcceleration()
{
    return elevationPullAcceleration; 
}

/** Setter for {@link AngleDeception#padding3}
  * @param pPadding3 new value of interest
  * @return same object to permit progressive setters */
public AngleDeception setPadding3(int pPadding3)
{
    padding3 = pPadding3;
    return this;
}

/** Getter for {@link AngleDeception#padding3}
  * @return value of interest */
public int getPadding3()
{
    return padding3; 
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
       dos.writeInt(recordType);
       dos.writeShort(recordLength);
       dos.writeShort(padding);
       dos.writeByte(emitterNumber);
       dos.writeByte(beamNumber);
       stateIndicator.marshal(dos);
       dos.writeByte(padding2);
       dos.writeFloat(azimuthOffset);
       dos.writeFloat(azimuthWidth);
       dos.writeFloat(azimuthPullRate);
       dos.writeFloat(azimuthPullAcceleration);
       dos.writeFloat(elevationOffset);
       dos.writeFloat(elevationWidth);
       dos.writeFloat(elevationPullRate);
       dos.writeFloat(elevationPullAcceleration);
       dos.writeInt(padding3);
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
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        recordType = dis.readInt();
        uPosition += 4;
        recordLength = (short)dis.readUnsignedShort();
        uPosition += 2;
        padding = (short)dis.readUnsignedShort();
        uPosition += 2;
        emitterNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        beamNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        stateIndicator = EEAttributeStateIndicator.unmarshalEnum(dis);
        uPosition += stateIndicator.getMarshalledSize();
        padding2 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        azimuthOffset = dis.readFloat();
        uPosition += 4;
        azimuthWidth = dis.readFloat();
        uPosition += 4;
        azimuthPullRate = dis.readFloat();
        uPosition += 4;
        azimuthPullAcceleration = dis.readFloat();
        uPosition += 4;
        elevationOffset = dis.readFloat();
        uPosition += 4;
        elevationWidth = dis.readFloat();
        uPosition += 4;
        elevationPullRate = dis.readFloat();
        uPosition += 4;
        elevationPullAcceleration = dis.readFloat();
        uPosition += 4;
        padding3 = dis.readInt();
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
   byteBuffer.putInt( (int)recordType);
   byteBuffer.putShort( (short)recordLength);
   byteBuffer.putShort( (short)padding);
   byteBuffer.put( (byte)emitterNumber);
   byteBuffer.put( (byte)beamNumber);
   stateIndicator.marshal(byteBuffer);
   byteBuffer.put( (byte)padding2);
   byteBuffer.putFloat( (float)azimuthOffset);
   byteBuffer.putFloat( (float)azimuthWidth);
   byteBuffer.putFloat( (float)azimuthPullRate);
   byteBuffer.putFloat( (float)azimuthPullAcceleration);
   byteBuffer.putFloat( (float)elevationOffset);
   byteBuffer.putFloat( (float)elevationWidth);
   byteBuffer.putFloat( (float)elevationPullRate);
   byteBuffer.putFloat( (float)elevationPullAcceleration);
   byteBuffer.putInt( (int)padding3);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    recordType = byteBuffer.getInt();
    recordLength = (short)(byteBuffer.getShort() & 0xFFFF);
    padding = (short)(byteBuffer.getShort() & 0xFFFF);
    emitterNumber = (byte)(byteBuffer.get() & 0xFF);
    beamNumber = (byte)(byteBuffer.get() & 0xFF);
    stateIndicator = EEAttributeStateIndicator.unmarshalEnum(byteBuffer);
    padding2 = (byte)(byteBuffer.get() & 0xFF);
    azimuthOffset = byteBuffer.getFloat();
    azimuthWidth = byteBuffer.getFloat();
    azimuthPullRate = byteBuffer.getFloat();
    azimuthPullAcceleration = byteBuffer.getFloat();
    elevationOffset = byteBuffer.getFloat();
    elevationWidth = byteBuffer.getFloat();
    elevationPullRate = byteBuffer.getFloat();
    elevationPullAcceleration = byteBuffer.getFloat();
    padding3 = byteBuffer.getInt();
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

     final AngleDeception rhs = (AngleDeception)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;
     if( ! (recordLength == rhs.recordLength)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
     if( ! (emitterNumber == rhs.emitterNumber)) ivarsEqual = false;
     if( ! (beamNumber == rhs.beamNumber)) ivarsEqual = false;
     if( ! (stateIndicator == rhs.stateIndicator)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;
     if( ! (azimuthOffset == rhs.azimuthOffset)) ivarsEqual = false;
     if( ! (azimuthWidth == rhs.azimuthWidth)) ivarsEqual = false;
     if( ! (azimuthPullRate == rhs.azimuthPullRate)) ivarsEqual = false;
     if( ! (azimuthPullAcceleration == rhs.azimuthPullAcceleration)) ivarsEqual = false;
     if( ! (elevationOffset == rhs.elevationOffset)) ivarsEqual = false;
     if( ! (elevationWidth == rhs.elevationWidth)) ivarsEqual = false;
     if( ! (elevationPullRate == rhs.elevationPullRate)) ivarsEqual = false;
     if( ! (elevationPullAcceleration == rhs.elevationPullAcceleration)) ivarsEqual = false;
     if( ! (padding3 == rhs.padding3)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" recordType: ").append(recordType).append("\n");
    sb.append(" recordLength: ").append(recordLength).append("\n");
    sb.append(" padding: ").append(padding).append("\n");
    sb.append(" emitterNumber: ").append(emitterNumber).append("\n");
    sb.append(" beamNumber: ").append(beamNumber).append("\n");
    sb.append(" stateIndicator: ").append(stateIndicator).append("\n");
    sb.append(" padding2: ").append(padding2).append("\n");
    sb.append(" azimuthOffset: ").append(azimuthOffset).append("\n");
    sb.append(" azimuthWidth: ").append(azimuthWidth).append("\n");
    sb.append(" azimuthPullRate: ").append(azimuthPullRate).append("\n");
    sb.append(" azimuthPullAcceleration: ").append(azimuthPullAcceleration).append("\n");
    sb.append(" elevationOffset: ").append(elevationOffset).append("\n");
    sb.append(" elevationWidth: ").append(elevationWidth).append("\n");
    sb.append(" elevationPullRate: ").append(elevationPullRate).append("\n");
    sb.append(" elevationPullAcceleration: ").append(elevationPullAcceleration).append("\n");
    sb.append(" padding3: ").append(padding3).append("\n");

   return sb.toString();
 }
} // end of class
