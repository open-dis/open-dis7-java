/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.10.4 Information about the location and status of a collection of mines in a minefield is conveyed through the Minefield Data PDU on an individual mine basis.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class MinefieldDataPdu extends MinefieldFamilyPdu implements Serializable
{
   /** Minefield ID */
   protected MinefieldIdentifier  minefieldID = new MinefieldIdentifier(); 

   /** ID of entity making request */
   protected SimulationIdentifier  requestingEntityID = new SimulationIdentifier(); 

   /** Minefield sequence number */
   protected short  minefieldSequenceNumbeer;

   /** request ID */
   protected byte  requestID;

   /** pdu sequence number */
   protected byte  pduSequenceNumber;

   /** number of pdus in response */
   protected byte  numberOfPdus;

   /** how many mines are in this PDU */
   protected byte  numberOfMinesInThisPdu;

   /** how many sensor type are in this PDU */
   protected byte  numberOfSensorTypes;

   /** padding */
   protected byte  padding = (byte)0;

   /** 32 boolean field */
   protected DataFilterRecord  dataFilter = new DataFilterRecord(); 

   /** Mine type */
   protected EntityType  mineType = new EntityType(); 

   /** Sensor types, each 16-bits long */
   protected List< MinefieldSensorType > sensorTypes = new ArrayList< MinefieldSensorType >();
 
   /** pad to 32-bit boundary */

   private byte[] padTo32 = new byte[0];

   /** Mine locations */
   protected List< Vector3Float > mineLocation = new ArrayList< Vector3Float >();
 
   /** groundBurialDepthOffset is an undescribed parameter... */
   protected float[]  groundBurialDepthOffset = new float[0]; 

   /** waterBurialDepthOffset is an undescribed parameter... */
   protected float[]  waterBurialDepthOffset = new float[0]; 

   /** snowBurialDepthOffset is an undescribed parameter... */
   protected float[]  snowBurialDepthOffset = new float[0]; 

   /** mineOrientation is an undescribed parameter... */
   protected List< EulerAngles > mineOrientation = new ArrayList< EulerAngles >();
 
   /** thermalContrast is an undescribed parameter... */
   protected float[]  thermalContrast = new float[0]; 

   /** reflectance is an undescribed parameter... */
   protected float[]  reflectance = new float[0]; 

   /** mineEmplacementTime is an undescribed parameter... */
   protected List< MineEmplacementTime > mineEmplacementTime = new ArrayList< MineEmplacementTime >();
 
   /** mineEntityNumber is an undescribed parameter... */
   protected short[]  mineEntityNumber = new short[0]; 

   /**  uid 192 */
   protected List< MinefieldDataFusing > fusing = new ArrayList< MinefieldDataFusing >();
 
   /** scalarDetectionCoefficient is an undescribed parameter... */
   protected byte[]  scalarDetectionCoefficient = new byte[0]; 

   /**  uid 202 */
   protected List< MinefieldDataPaintScheme > paintScheme = new ArrayList< MinefieldDataPaintScheme >();
 
   /** pad to 32-bit boundary */

   private byte[] padTo32_2 = new byte[0];

   /** numberOfTripDetonationWires is an undescribed parameter... */
   protected byte[]  numberOfTripDetonationWires = new byte[0]; 

   /** pad to 32-bit boundary */

   private byte[] padTo32_3 = new byte[0];

   /** numberOfVertices is an undescribed parameter... */
   protected byte[]  numberOfVertices = new byte[0]; 


/** Constructor */
 public MinefieldDataPdu()
 {
    setPduType( DISPDUType.MINEFIELD_DATA );
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
   marshalSize += minefieldID.getMarshalledSize();
   marshalSize += requestingEntityID.getMarshalledSize();
   marshalSize += 2;  // minefieldSequenceNumbeer
   marshalSize += 1;  // requestID
   marshalSize += 1;  // pduSequenceNumber
   marshalSize += 1;  // numberOfPdus
   marshalSize += 1;  // numberOfMinesInThisPdu
   marshalSize += 1;  // numberOfSensorTypes
   marshalSize += 1;  // padding
   marshalSize += dataFilter.getMarshalledSize();
   marshalSize += mineType.getMarshalledSize();
   for(int idx=0; idx < sensorTypes.size(); idx++)
   {
        MinefieldSensorType listElement = sensorTypes.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   marshalSize += padTo32.length;
   for(int idx=0; idx < mineLocation.size(); idx++)
   {
        Vector3Float listElement = mineLocation.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   marshalSize += groundBurialDepthOffset.length * 4;
   marshalSize += waterBurialDepthOffset.length * 4;
   marshalSize += snowBurialDepthOffset.length * 4;
   for(int idx=0; idx < mineOrientation.size(); idx++)
   {
        EulerAngles listElement = mineOrientation.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   marshalSize += thermalContrast.length * 4;
   marshalSize += reflectance.length * 4;
   for(int idx=0; idx < mineEmplacementTime.size(); idx++)
   {
        MineEmplacementTime listElement = mineEmplacementTime.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   marshalSize += mineEntityNumber.length * 2;
   for(int idx=0; idx < fusing.size(); idx++)
   {
        MinefieldDataFusing listElement = fusing.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   marshalSize += scalarDetectionCoefficient.length * 1;
   for(int idx=0; idx < paintScheme.size(); idx++)
   {
        MinefieldDataPaintScheme listElement = paintScheme.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   marshalSize += padTo32_2.length;
   marshalSize += numberOfTripDetonationWires.length * 1;
   marshalSize += padTo32_3.length;
   marshalSize += numberOfVertices.length * 1;

   return marshalSize;
}


/** Setter for {@link MinefieldDataPdu#minefieldID}
  * @param pMinefieldID new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setMinefieldID(MinefieldIdentifier pMinefieldID)
{
    minefieldID = pMinefieldID;
    return this;
}

/** Getter for {@link MinefieldDataPdu#minefieldID}
  * @return value of interest */
public MinefieldIdentifier getMinefieldID()
{
    return minefieldID; 
}

/** Setter for {@link MinefieldDataPdu#requestingEntityID}
  * @param pRequestingEntityID new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setRequestingEntityID(SimulationIdentifier pRequestingEntityID)
{
    requestingEntityID = pRequestingEntityID;
    return this;
}

/** Getter for {@link MinefieldDataPdu#requestingEntityID}
  * @return value of interest */
public SimulationIdentifier getRequestingEntityID()
{
    return requestingEntityID; 
}

/** Setter for {@link MinefieldDataPdu#minefieldSequenceNumbeer}
  * @param pMinefieldSequenceNumbeer new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setMinefieldSequenceNumbeer(short pMinefieldSequenceNumbeer)
{
    minefieldSequenceNumbeer = pMinefieldSequenceNumbeer;
    return this;
}
/** Utility setter for {@link MinefieldDataPdu#minefieldSequenceNumbeer}
  * @param pMinefieldSequenceNumbeer new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setMinefieldSequenceNumbeer(int pMinefieldSequenceNumbeer){
    minefieldSequenceNumbeer = (short) pMinefieldSequenceNumbeer;
    return this;
}

/** Getter for {@link MinefieldDataPdu#minefieldSequenceNumbeer}
  * @return value of interest */
public short getMinefieldSequenceNumbeer()
{
    return minefieldSequenceNumbeer; 
}

/** Setter for {@link MinefieldDataPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setRequestID(byte pRequestID)
{
    requestID = pRequestID;
    return this;
}
/** Utility setter for {@link MinefieldDataPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setRequestID(int pRequestID){
    requestID = (byte) pRequestID;
    return this;
}

/** Getter for {@link MinefieldDataPdu#requestID}
  * @return value of interest */
public byte getRequestID()
{
    return requestID; 
}

/** Setter for {@link MinefieldDataPdu#pduSequenceNumber}
  * @param pPduSequenceNumber new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setPduSequenceNumber(byte pPduSequenceNumber)
{
    pduSequenceNumber = pPduSequenceNumber;
    return this;
}
/** Utility setter for {@link MinefieldDataPdu#pduSequenceNumber}
  * @param pPduSequenceNumber new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setPduSequenceNumber(int pPduSequenceNumber){
    pduSequenceNumber = (byte) pPduSequenceNumber;
    return this;
}

/** Getter for {@link MinefieldDataPdu#pduSequenceNumber}
  * @return value of interest */
public byte getPduSequenceNumber()
{
    return pduSequenceNumber; 
}

/** Setter for {@link MinefieldDataPdu#numberOfPdus}
  * @param pNumberOfPdus new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setNumberOfPdus(byte pNumberOfPdus)
{
    numberOfPdus = pNumberOfPdus;
    return this;
}
/** Utility setter for {@link MinefieldDataPdu#numberOfPdus}
  * @param pNumberOfPdus new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setNumberOfPdus(int pNumberOfPdus){
    numberOfPdus = (byte) pNumberOfPdus;
    return this;
}

/** Getter for {@link MinefieldDataPdu#numberOfPdus}
  * @return value of interest */
public byte getNumberOfPdus()
{
    return numberOfPdus; 
}

/** Setter for {@link MinefieldDataPdu#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setPadding(byte pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link MinefieldDataPdu#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setPadding(int pPadding){
    padding = (byte) pPadding;
    return this;
}

/** Getter for {@link MinefieldDataPdu#padding}
  * @return value of interest */
public byte getPadding()
{
    return padding; 
}

/** Setter for {@link MinefieldDataPdu#dataFilter}
  * @param pDataFilter new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setDataFilter(DataFilterRecord pDataFilter)
{
    dataFilter = pDataFilter;
    return this;
}

/** Getter for {@link MinefieldDataPdu#dataFilter}
  * @return value of interest */
public DataFilterRecord getDataFilter()
{
    return dataFilter; 
}

/** Setter for {@link MinefieldDataPdu#mineType}
  * @param pMineType new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setMineType(EntityType pMineType)
{
    mineType = pMineType;
    return this;
}

/** Getter for {@link MinefieldDataPdu#mineType}
  * @return value of interest */
public EntityType getMineType()
{
    return mineType; 
}

/** Setter for {@link MinefieldDataPdu#sensorTypes}
  * @param pSensorTypes new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setSensorTypes(List<MinefieldSensorType> pSensorTypes)
{
    sensorTypes = pSensorTypes;
    return this;
}

/** Getter for {@link MinefieldDataPdu#sensorTypes}
  * @return value of interest */
public List<MinefieldSensorType> getSensorTypes()
{
    return sensorTypes; 
}

/** Setter for {@link MinefieldDataPdu#mineLocation}
  * @param pMineLocation new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setMineLocation(List<Vector3Float> pMineLocation)
{
    mineLocation = pMineLocation;
    return this;
}

/** Getter for {@link MinefieldDataPdu#mineLocation}
  * @return value of interest */
public List<Vector3Float> getMineLocation()
{
    return mineLocation; 
}

/** Setter for {@link MinefieldDataPdu#groundBurialDepthOffset}
  * @param pGroundBurialDepthOffset new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setGroundBurialDepthOffset(float[] pGroundBurialDepthOffset)
{
    groundBurialDepthOffset = pGroundBurialDepthOffset;
    return this;
}

/** Getter for {@link MinefieldDataPdu#groundBurialDepthOffset}
  * @return value of interest */
public float[] getGroundBurialDepthOffset()
{
    return groundBurialDepthOffset; 
}

/** Setter for {@link MinefieldDataPdu#waterBurialDepthOffset}
  * @param pWaterBurialDepthOffset new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setWaterBurialDepthOffset(float[] pWaterBurialDepthOffset)
{
    waterBurialDepthOffset = pWaterBurialDepthOffset;
    return this;
}

/** Getter for {@link MinefieldDataPdu#waterBurialDepthOffset}
  * @return value of interest */
public float[] getWaterBurialDepthOffset()
{
    return waterBurialDepthOffset; 
}

/** Setter for {@link MinefieldDataPdu#snowBurialDepthOffset}
  * @param pSnowBurialDepthOffset new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setSnowBurialDepthOffset(float[] pSnowBurialDepthOffset)
{
    snowBurialDepthOffset = pSnowBurialDepthOffset;
    return this;
}

/** Getter for {@link MinefieldDataPdu#snowBurialDepthOffset}
  * @return value of interest */
public float[] getSnowBurialDepthOffset()
{
    return snowBurialDepthOffset; 
}

/** Setter for {@link MinefieldDataPdu#mineOrientation}
  * @param pMineOrientation new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setMineOrientation(List<EulerAngles> pMineOrientation)
{
    mineOrientation = pMineOrientation;
    return this;
}

/** Getter for {@link MinefieldDataPdu#mineOrientation}
  * @return value of interest */
public List<EulerAngles> getMineOrientation()
{
    return mineOrientation; 
}

/** Setter for {@link MinefieldDataPdu#thermalContrast}
  * @param pThermalContrast new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setThermalContrast(float[] pThermalContrast)
{
    thermalContrast = pThermalContrast;
    return this;
}

/** Getter for {@link MinefieldDataPdu#thermalContrast}
  * @return value of interest */
public float[] getThermalContrast()
{
    return thermalContrast; 
}

/** Setter for {@link MinefieldDataPdu#reflectance}
  * @param pReflectance new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setReflectance(float[] pReflectance)
{
    reflectance = pReflectance;
    return this;
}

/** Getter for {@link MinefieldDataPdu#reflectance}
  * @return value of interest */
public float[] getReflectance()
{
    return reflectance; 
}

/** Setter for {@link MinefieldDataPdu#mineEmplacementTime}
  * @param pMineEmplacementTime new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setMineEmplacementTime(List<MineEmplacementTime> pMineEmplacementTime)
{
    mineEmplacementTime = pMineEmplacementTime;
    return this;
}

/** Getter for {@link MinefieldDataPdu#mineEmplacementTime}
  * @return value of interest */
public List<MineEmplacementTime> getMineEmplacementTime()
{
    return mineEmplacementTime; 
}

/** Setter for {@link MinefieldDataPdu#mineEntityNumber}
  * @param pMineEntityNumber new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setMineEntityNumber(short[] pMineEntityNumber)
{
    mineEntityNumber = pMineEntityNumber;
    return this;
}

/** Getter for {@link MinefieldDataPdu#mineEntityNumber}
  * @return value of interest */
public short[] getMineEntityNumber()
{
    return mineEntityNumber; 
}

/** Setter for {@link MinefieldDataPdu#fusing}
  * @param pFusing new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setFusing(List<MinefieldDataFusing> pFusing)
{
    fusing = pFusing;
    return this;
}

/** Getter for {@link MinefieldDataPdu#fusing}
  * @return value of interest */
public List<MinefieldDataFusing> getFusing()
{
    return fusing; 
}

/** Setter for {@link MinefieldDataPdu#scalarDetectionCoefficient}
  * @param pScalarDetectionCoefficient new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setScalarDetectionCoefficient(byte[] pScalarDetectionCoefficient)
{
    scalarDetectionCoefficient = pScalarDetectionCoefficient;
    return this;
}

/** Getter for {@link MinefieldDataPdu#scalarDetectionCoefficient}
  * @return value of interest */
public byte[] getScalarDetectionCoefficient()
{
    return scalarDetectionCoefficient; 
}

/** Setter for {@link MinefieldDataPdu#paintScheme}
  * @param pPaintScheme new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setPaintScheme(List<MinefieldDataPaintScheme> pPaintScheme)
{
    paintScheme = pPaintScheme;
    return this;
}

/** Getter for {@link MinefieldDataPdu#paintScheme}
  * @return value of interest */
public List<MinefieldDataPaintScheme> getPaintScheme()
{
    return paintScheme; 
}

/** Setter for {@link MinefieldDataPdu#numberOfTripDetonationWires}
  * @param pNumberOfTripDetonationWires new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setNumberOfTripDetonationWires(byte[] pNumberOfTripDetonationWires)
{
    numberOfTripDetonationWires = pNumberOfTripDetonationWires;
    return this;
}

/** Getter for {@link MinefieldDataPdu#numberOfTripDetonationWires}
  * @return value of interest */
public byte[] getNumberOfTripDetonationWires()
{
    return numberOfTripDetonationWires; 
}

/** Setter for {@link MinefieldDataPdu#numberOfVertices}
  * @param pNumberOfVertices new value of interest
  * @return same object to permit progressive setters */
public MinefieldDataPdu setNumberOfVertices(byte[] pNumberOfVertices)
{
    numberOfVertices = pNumberOfVertices;
    return this;
}

/** Getter for {@link MinefieldDataPdu#numberOfVertices}
  * @return value of interest */
public byte[] getNumberOfVertices()
{
    return numberOfVertices; 
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
       minefieldID.marshal(dos);
       requestingEntityID.marshal(dos);
       dos.writeShort(minefieldSequenceNumbeer);
       dos.writeByte(requestID);
       dos.writeByte(pduSequenceNumber);
       dos.writeByte(numberOfPdus);
       dos.writeByte(numberOfVertices.length);
       dos.writeByte(sensorTypes.size());
       dos.writeByte(padding);
       dataFilter.marshal(dos);
       mineType.marshal(dos);

       for(int idx = 0; idx < sensorTypes.size(); idx++)
       {
            MinefieldSensorType aMinefieldSensorType = sensorTypes.get(idx);
            aMinefieldSensorType.marshal(dos);
       }

       padTo32 = new byte[Align.to32bits(dos)];

       for(int idx = 0; idx < mineLocation.size(); idx++)
       {
            Vector3Float aVector3Float = mineLocation.get(idx);
            aVector3Float.marshal(dos);
       }


       for(int idx = 0; idx < groundBurialDepthOffset.length; idx++)
           dos.writeFloat(groundBurialDepthOffset[idx]);


       for(int idx = 0; idx < waterBurialDepthOffset.length; idx++)
           dos.writeFloat(waterBurialDepthOffset[idx]);


       for(int idx = 0; idx < snowBurialDepthOffset.length; idx++)
           dos.writeFloat(snowBurialDepthOffset[idx]);


       for(int idx = 0; idx < mineOrientation.size(); idx++)
       {
            EulerAngles aEulerAngles = mineOrientation.get(idx);
            aEulerAngles.marshal(dos);
       }


       for(int idx = 0; idx < thermalContrast.length; idx++)
           dos.writeFloat(thermalContrast[idx]);


       for(int idx = 0; idx < reflectance.length; idx++)
           dos.writeFloat(reflectance[idx]);


       for(int idx = 0; idx < mineEmplacementTime.size(); idx++)
       {
            MineEmplacementTime aMineEmplacementTime = mineEmplacementTime.get(idx);
            aMineEmplacementTime.marshal(dos);
       }


       for(int idx = 0; idx < mineEntityNumber.length; idx++)
           dos.writeShort(mineEntityNumber[idx]);


       for(int idx = 0; idx < fusing.size(); idx++)
       {
            MinefieldDataFusing aMinefieldDataFusing = fusing.get(idx);
            aMinefieldDataFusing.marshal(dos);
       }


       for(int idx = 0; idx < scalarDetectionCoefficient.length; idx++)
           dos.writeByte(scalarDetectionCoefficient[idx]);


       for(int idx = 0; idx < paintScheme.size(); idx++)
       {
            MinefieldDataPaintScheme aMinefieldDataPaintScheme = paintScheme.get(idx);
            aMinefieldDataPaintScheme.marshal(dos);
       }

       padTo32_2 = new byte[Align.to32bits(dos)];

       for(int idx = 0; idx < numberOfTripDetonationWires.length; idx++)
           dos.writeByte(numberOfTripDetonationWires[idx]);

       padTo32_3 = new byte[Align.to32bits(dos)];

       for(int idx = 0; idx < numberOfVertices.length; idx++)
           dos.writeByte(numberOfVertices[idx]);

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
        uPosition += minefieldID.unmarshal(dis);
        uPosition += requestingEntityID.unmarshal(dis);
        minefieldSequenceNumbeer = (short)dis.readUnsignedShort();
        uPosition += 2;
        requestID = (byte)dis.readUnsignedByte();
        uPosition += 1;
        pduSequenceNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        numberOfPdus = (byte)dis.readUnsignedByte();
        uPosition += 1;
        numberOfMinesInThisPdu = (byte)dis.readUnsignedByte();
        uPosition += 1;
        numberOfSensorTypes = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += dataFilter.unmarshal(dis);
        uPosition += mineType.unmarshal(dis);
        for(int idx = 0; idx < numberOfSensorTypes; idx++)
        {
            MinefieldSensorType anX = new MinefieldSensorType();
            uPosition += anX.unmarshal(dis);
            sensorTypes.add(anX);
        }

        padTo32 = new byte[Align.from32bits(uPosition,dis)];
        uPosition += padTo32.length;
        for(int idx = 0; idx < numberOfMinesInThisPdu; idx++)
        {
            Vector3Float anX = new Vector3Float();
            uPosition += anX.unmarshal(dis);
            mineLocation.add(anX);
        }

        for(int idx = 0; idx < groundBurialDepthOffset.length; idx++)
            groundBurialDepthOffset[idx] = dis.readFloat();
        uPosition += (groundBurialDepthOffset.length * 4);
        for(int idx = 0; idx < waterBurialDepthOffset.length; idx++)
            waterBurialDepthOffset[idx] = dis.readFloat();
        uPosition += (waterBurialDepthOffset.length * 4);
        for(int idx = 0; idx < snowBurialDepthOffset.length; idx++)
            snowBurialDepthOffset[idx] = dis.readFloat();
        uPosition += (snowBurialDepthOffset.length * 4);
        for(int idx = 0; idx < numberOfMinesInThisPdu; idx++)
        {
            EulerAngles anX = new EulerAngles();
            uPosition += anX.unmarshal(dis);
            mineOrientation.add(anX);
        }

        for(int idx = 0; idx < thermalContrast.length; idx++)
            thermalContrast[idx] = dis.readFloat();
        uPosition += (thermalContrast.length * 4);
        for(int idx = 0; idx < reflectance.length; idx++)
            reflectance[idx] = dis.readFloat();
        uPosition += (reflectance.length * 4);
        for(int idx = 0; idx < numberOfMinesInThisPdu; idx++)
        {
            MineEmplacementTime anX = new MineEmplacementTime();
            uPosition += anX.unmarshal(dis);
            mineEmplacementTime.add(anX);
        }

        for(int idx = 0; idx < mineEntityNumber.length; idx++)
            mineEntityNumber[idx] = dis.readShort();
        uPosition += (mineEntityNumber.length * 2);
        for(int idx = 0; idx < numberOfMinesInThisPdu; idx++)
        {
            MinefieldDataFusing anX = new MinefieldDataFusing();
            uPosition += anX.unmarshal(dis);
            fusing.add(anX);
        }

        for(int idx = 0; idx < scalarDetectionCoefficient.length; idx++)
            scalarDetectionCoefficient[idx] = dis.readByte();
        uPosition += (scalarDetectionCoefficient.length * 1);
        for(int idx = 0; idx < numberOfMinesInThisPdu; idx++)
        {
            MinefieldDataPaintScheme anX = new MinefieldDataPaintScheme();
            uPosition += anX.unmarshal(dis);
            paintScheme.add(anX);
        }

        padTo32_2 = new byte[Align.from32bits(uPosition,dis)];
        uPosition += padTo32_2.length;
        for(int idx = 0; idx < numberOfTripDetonationWires.length; idx++)
            numberOfTripDetonationWires[idx] = dis.readByte();
        uPosition += (numberOfTripDetonationWires.length * 1);
        padTo32_3 = new byte[Align.from32bits(uPosition,dis)];
        uPosition += padTo32_3.length;
        for(int idx = 0; idx < numberOfVertices.length; idx++)
            numberOfVertices[idx] = dis.readByte();
        uPosition += (numberOfVertices.length * 1);
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
   minefieldID.marshal(byteBuffer);
   requestingEntityID.marshal(byteBuffer);
   byteBuffer.putShort( (short)minefieldSequenceNumbeer);
   byteBuffer.put( (byte)requestID);
   byteBuffer.put( (byte)pduSequenceNumber);
   byteBuffer.put( (byte)numberOfPdus);
   byteBuffer.put( (byte)numberOfVertices.length);
   byteBuffer.put( (byte)sensorTypes.size());
   byteBuffer.put( (byte)padding);
   dataFilter.marshal(byteBuffer);
   mineType.marshal(byteBuffer);

   for(int idx = 0; idx < sensorTypes.size(); idx++)
   {
        MinefieldSensorType aMinefieldSensorType = sensorTypes.get(idx);
        aMinefieldSensorType.marshal(byteBuffer);
   }

   padTo32 = new byte[Align.to32bits(byteBuffer)];

   for(int idx = 0; idx < mineLocation.size(); idx++)
   {
        Vector3Float aVector3Float = mineLocation.get(idx);
        aVector3Float.marshal(byteBuffer);
   }


   for(int idx = 0; idx < groundBurialDepthOffset.length; idx++)
       byteBuffer.putFloat((float)groundBurialDepthOffset[idx]);


   for(int idx = 0; idx < waterBurialDepthOffset.length; idx++)
       byteBuffer.putFloat((float)waterBurialDepthOffset[idx]);


   for(int idx = 0; idx < snowBurialDepthOffset.length; idx++)
       byteBuffer.putFloat((float)snowBurialDepthOffset[idx]);


   for(int idx = 0; idx < mineOrientation.size(); idx++)
   {
        EulerAngles aEulerAngles = mineOrientation.get(idx);
        aEulerAngles.marshal(byteBuffer);
   }


   for(int idx = 0; idx < thermalContrast.length; idx++)
       byteBuffer.putFloat((float)thermalContrast[idx]);


   for(int idx = 0; idx < reflectance.length; idx++)
       byteBuffer.putFloat((float)reflectance[idx]);


   for(int idx = 0; idx < mineEmplacementTime.size(); idx++)
   {
        MineEmplacementTime aMineEmplacementTime = mineEmplacementTime.get(idx);
        aMineEmplacementTime.marshal(byteBuffer);
   }


   for(int idx = 0; idx < mineEntityNumber.length; idx++)
       byteBuffer.putShort((short)mineEntityNumber[idx]);


   for(int idx = 0; idx < fusing.size(); idx++)
   {
        MinefieldDataFusing aMinefieldDataFusing = fusing.get(idx);
        aMinefieldDataFusing.marshal(byteBuffer);
   }


   for(int idx = 0; idx < scalarDetectionCoefficient.length; idx++)
       byteBuffer.put((byte)scalarDetectionCoefficient[idx]);


   for(int idx = 0; idx < paintScheme.size(); idx++)
   {
        MinefieldDataPaintScheme aMinefieldDataPaintScheme = paintScheme.get(idx);
        aMinefieldDataPaintScheme.marshal(byteBuffer);
   }

   padTo32_2 = new byte[Align.to32bits(byteBuffer)];

   for(int idx = 0; idx < numberOfTripDetonationWires.length; idx++)
       byteBuffer.put((byte)numberOfTripDetonationWires[idx]);

   padTo32_3 = new byte[Align.to32bits(byteBuffer)];

   for(int idx = 0; idx < numberOfVertices.length; idx++)
       byteBuffer.put((byte)numberOfVertices[idx]);

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

    minefieldID.unmarshal(byteBuffer);
    requestingEntityID.unmarshal(byteBuffer);
    minefieldSequenceNumbeer = (short)(byteBuffer.getShort() & 0xFFFF);
    requestID = (byte)(byteBuffer.get() & 0xFF);
    pduSequenceNumber = (byte)(byteBuffer.get() & 0xFF);
    numberOfPdus = (byte)(byteBuffer.get() & 0xFF);
    numberOfMinesInThisPdu = (byte)(byteBuffer.get() & 0xFF);
    numberOfSensorTypes = (byte)(byteBuffer.get() & 0xFF);
    padding = (byte)(byteBuffer.get() & 0xFF);
    dataFilter.unmarshal(byteBuffer);
    mineType.unmarshal(byteBuffer);
    for(int idx = 0; idx < numberOfSensorTypes; idx++)
    {
    MinefieldSensorType anX = new MinefieldSensorType();
    anX.unmarshal(byteBuffer);
    sensorTypes.add(anX);
    }

    padTo32 = new byte[Align.from32bits(byteBuffer)];
    for(int idx = 0; idx < numberOfMinesInThisPdu; idx++)
    {
    Vector3Float anX = new Vector3Float();
    anX.unmarshal(byteBuffer);
    mineLocation.add(anX);
    }

    for(int idx = 0; idx < groundBurialDepthOffset.length; idx++)
        groundBurialDepthOffset[idx] = byteBuffer.getFloat();
    for(int idx = 0; idx < waterBurialDepthOffset.length; idx++)
        waterBurialDepthOffset[idx] = byteBuffer.getFloat();
    for(int idx = 0; idx < snowBurialDepthOffset.length; idx++)
        snowBurialDepthOffset[idx] = byteBuffer.getFloat();
    for(int idx = 0; idx < numberOfMinesInThisPdu; idx++)
    {
    EulerAngles anX = new EulerAngles();
    anX.unmarshal(byteBuffer);
    mineOrientation.add(anX);
    }

    for(int idx = 0; idx < thermalContrast.length; idx++)
        thermalContrast[idx] = byteBuffer.getFloat();
    for(int idx = 0; idx < reflectance.length; idx++)
        reflectance[idx] = byteBuffer.getFloat();
    for(int idx = 0; idx < numberOfMinesInThisPdu; idx++)
    {
    MineEmplacementTime anX = new MineEmplacementTime();
    anX.unmarshal(byteBuffer);
    mineEmplacementTime.add(anX);
    }

    for(int idx = 0; idx < mineEntityNumber.length; idx++)
        mineEntityNumber[idx] = byteBuffer.getShort();
    for(int idx = 0; idx < numberOfMinesInThisPdu; idx++)
    {
    MinefieldDataFusing anX = new MinefieldDataFusing();
    anX.unmarshal(byteBuffer);
    fusing.add(anX);
    }

    for(int idx = 0; idx < scalarDetectionCoefficient.length; idx++)
        scalarDetectionCoefficient[idx] = byteBuffer.get();
    for(int idx = 0; idx < numberOfMinesInThisPdu; idx++)
    {
    MinefieldDataPaintScheme anX = new MinefieldDataPaintScheme();
    anX.unmarshal(byteBuffer);
    paintScheme.add(anX);
    }

    padTo32_2 = new byte[Align.from32bits(byteBuffer)];
    for(int idx = 0; idx < numberOfTripDetonationWires.length; idx++)
        numberOfTripDetonationWires[idx] = byteBuffer.get();
    padTo32_3 = new byte[Align.from32bits(byteBuffer)];
    for(int idx = 0; idx < numberOfVertices.length; idx++)
        numberOfVertices[idx] = byteBuffer.get();
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

     final MinefieldDataPdu rhs = (MinefieldDataPdu)obj;

     if( ! (minefieldID.equals( rhs.minefieldID) )) ivarsEqual = false;
     if( ! (requestingEntityID.equals( rhs.requestingEntityID) )) ivarsEqual = false;
     if( ! (minefieldSequenceNumbeer == rhs.minefieldSequenceNumbeer)) ivarsEqual = false;
     if( ! (requestID == rhs.requestID)) ivarsEqual = false;
     if( ! (pduSequenceNumber == rhs.pduSequenceNumber)) ivarsEqual = false;
     if( ! (numberOfPdus == rhs.numberOfPdus)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
     if( ! (dataFilter.equals( rhs.dataFilter) )) ivarsEqual = false;
     if( ! (mineType.equals( rhs.mineType) )) ivarsEqual = false;

     for(int idx = 0; idx < sensorTypes.size(); idx++)
        if( ! ( sensorTypes.get(idx).equals(rhs.sensorTypes.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < mineLocation.size(); idx++)
        if( ! ( mineLocation.get(idx).equals(rhs.mineLocation.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < 0; idx++)
     {
          if(!(groundBurialDepthOffset[idx] == rhs.groundBurialDepthOffset[idx])) ivarsEqual = false;
     }


     for(int idx = 0; idx < 0; idx++)
     {
          if(!(waterBurialDepthOffset[idx] == rhs.waterBurialDepthOffset[idx])) ivarsEqual = false;
     }


     for(int idx = 0; idx < 0; idx++)
     {
          if(!(snowBurialDepthOffset[idx] == rhs.snowBurialDepthOffset[idx])) ivarsEqual = false;
     }


     for(int idx = 0; idx < mineOrientation.size(); idx++)
        if( ! ( mineOrientation.get(idx).equals(rhs.mineOrientation.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < 0; idx++)
     {
          if(!(thermalContrast[idx] == rhs.thermalContrast[idx])) ivarsEqual = false;
     }


     for(int idx = 0; idx < 0; idx++)
     {
          if(!(reflectance[idx] == rhs.reflectance[idx])) ivarsEqual = false;
     }


     for(int idx = 0; idx < mineEmplacementTime.size(); idx++)
        if( ! ( mineEmplacementTime.get(idx).equals(rhs.mineEmplacementTime.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < 0; idx++)
     {
          if(!(mineEntityNumber[idx] == rhs.mineEntityNumber[idx])) ivarsEqual = false;
     }


     for(int idx = 0; idx < fusing.size(); idx++)
        if( ! ( fusing.get(idx).equals(rhs.fusing.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < 0; idx++)
     {
          if(!(scalarDetectionCoefficient[idx] == rhs.scalarDetectionCoefficient[idx])) ivarsEqual = false;
     }


     for(int idx = 0; idx < paintScheme.size(); idx++)
        if( ! ( paintScheme.get(idx).equals(rhs.paintScheme.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < 0; idx++)
     {
          if(!(numberOfTripDetonationWires[idx] == rhs.numberOfTripDetonationWires[idx])) ivarsEqual = false;
     }


     for(int idx = 0; idx < 0; idx++)
     {
          if(!(numberOfVertices[idx] == rhs.numberOfVertices[idx])) ivarsEqual = false;
     }

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" minefieldID: ").append(minefieldID).append("\n");
    sb.append(" requestingEntityID: ").append(requestingEntityID).append("\n");
    sb.append(" minefieldSequenceNumbeer: ").append(minefieldSequenceNumbeer).append("\n");
    sb.append(" requestID: ").append(requestID).append("\n");
    sb.append(" pduSequenceNumber: ").append(pduSequenceNumber).append("\n");
    sb.append(" numberOfPdus: ").append(numberOfPdus).append("\n");
    sb.append(" padding: ").append(padding).append("\n");
    sb.append(" dataFilter: ").append(dataFilter).append("\n");
    sb.append(" mineType: ").append(mineType).append("\n");
    sb.append(" padTo32: ").append(padTo32).append("\n");
    sb.append(" groundBurialDepthOffset: ").append("\n");
    sb.append(Arrays.toString(groundBurialDepthOffset)).append("\n");
    sb.append(" waterBurialDepthOffset: ").append("\n");
    sb.append(Arrays.toString(waterBurialDepthOffset)).append("\n");
    sb.append(" snowBurialDepthOffset: ").append("\n");
    sb.append(Arrays.toString(snowBurialDepthOffset)).append("\n");
    sb.append(" thermalContrast: ").append("\n");
    sb.append(Arrays.toString(thermalContrast)).append("\n");
    sb.append(" reflectance: ").append("\n");
    sb.append(Arrays.toString(reflectance)).append("\n");
    sb.append(" mineEntityNumber: ").append("\n");
    sb.append(Arrays.toString(mineEntityNumber)).append("\n");
    sb.append(" scalarDetectionCoefficient: ").append("\n");
    sb.append(Arrays.toString(scalarDetectionCoefficient)).append("\n");
    sb.append(" padTo32_2: ").append(padTo32_2).append("\n");
    sb.append(" numberOfTripDetonationWires: ").append("\n");
    sb.append(Arrays.toString(numberOfTripDetonationWires)).append("\n");
    sb.append(" padTo32_3: ").append(padTo32_3).append("\n");
    sb.append(" numberOfVertices: ").append("\n");
    sb.append(Arrays.toString(numberOfVertices)).append("\n");
    sb.append(" sensorTypes: ").append("\n");
    sensorTypes.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" mineLocation: ").append("\n");
    mineLocation.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" mineOrientation: ").append("\n");
    mineOrientation.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" mineEmplacementTime: ").append("\n");
    mineEmplacementTime.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" fusing: ").append("\n");
    fusing.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" paintScheme: ").append("\n");
    paintScheme.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
