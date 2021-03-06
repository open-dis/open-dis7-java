/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.8.3 Communicates the state of a particular radio transmitter or simple intercom.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class TransmitterPdu extends RadioCommunicationsFamilyPdu implements Serializable
{
   /** header is an undescribed parameter... */
   protected RadioCommsHeader  header = new RadioCommsHeader(); 

   /** particular radio within an entity */
   protected short  radioNumber;

   /** Type of radio */
   protected RadioType  radioEntityType = new RadioType(); 

   /** transmit state uid 164 */
   protected TransmitterTransmitState transmitState = TransmitterTransmitState.values()[0];

   /** input source uid 165 */
   protected TransmitterInputSource inputSource = TransmitterInputSource.values()[0];

   /** count field */
   protected short  variableTransmitterParameterCount;

   /** Location of antenna */
   protected Vector3Double  antennaLocation = new Vector3Double(); 

   /** relative location of antenna */
   protected Vector3Float  relativeAntennaLocation = new Vector3Float(); 

   /** antenna pattern type uid 167 */
   protected TransmitterAntennaPatternType antennaPatternType = TransmitterAntennaPatternType.values()[0];

   /** atenna pattern length */
   protected short  antennaPatternCount;

   /** frequency */
   protected long  frequency;

   /** transmit frequency Bandwidth */
   protected float  transmitFrequencyBandwidth;

   /** transmission power */
   protected float  power;

   /** modulation */
   protected ModulationType  modulationType = new ModulationType(); 

   /** crypto system enumeration uid 166 */
   protected TransmitterCryptoSystem cryptoSystem = TransmitterCryptoSystem.values()[0];

   /** crypto system key identifer */
   protected short  cryptoKeyId;

   /** how many modulation parameters we have */
   protected byte  modulationParameterCount;

   /** padding1 is an undescribed parameter... */
   protected byte  padding1 = (byte)0;

   /** padding2 is an undescribed parameter... */
   protected short  padding2 = (short)0;

   /** variable length list of modulation parameters */
   protected List< ModulationParameters > modulationParametersList = new ArrayList< ModulationParameters >();
 
   /** variable length list of antenna pattern records */
   protected List< VariableTransmitterParameters > antennaPatternList = new ArrayList< VariableTransmitterParameters >();
 

/** Constructor */
 public TransmitterPdu()
 {
    setPduType( DISPDUType.TRANSMITTER );
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
   marshalSize += header.getMarshalledSize();
   marshalSize += 2;  // radioNumber
   marshalSize += radioEntityType.getMarshalledSize();
   marshalSize += transmitState.getMarshalledSize();
   marshalSize += inputSource.getMarshalledSize();
   marshalSize += 2;  // variableTransmitterParameterCount
   marshalSize += antennaLocation.getMarshalledSize();
   marshalSize += relativeAntennaLocation.getMarshalledSize();
   marshalSize += antennaPatternType.getMarshalledSize();
   marshalSize += 2;  // antennaPatternCount
   marshalSize += 8;  // frequency
   marshalSize += 4;  // transmitFrequencyBandwidth
   marshalSize += 4;  // power
   marshalSize += modulationType.getMarshalledSize();
   marshalSize += cryptoSystem.getMarshalledSize();
   marshalSize += 2;  // cryptoKeyId
   marshalSize += 1;  // modulationParameterCount
   marshalSize += 1;  // padding1
   marshalSize += 2;  // padding2
   for(int idx=0; idx < modulationParametersList.size(); idx++)
   {
        ModulationParameters listElement = modulationParametersList.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   for(int idx=0; idx < antennaPatternList.size(); idx++)
   {
        VariableTransmitterParameters listElement = antennaPatternList.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link TransmitterPdu#header}
  * @param pHeader new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setHeader(RadioCommsHeader pHeader)
{
    header = pHeader;
    return this;
}

/** Getter for {@link TransmitterPdu#header}
  * @return value of interest */
public RadioCommsHeader getHeader()
{
    return header; 
}

/** Setter for {@link TransmitterPdu#radioNumber}
  * @param pRadioNumber new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setRadioNumber(short pRadioNumber)
{
    radioNumber = pRadioNumber;
    return this;
}
/** Utility setter for {@link TransmitterPdu#radioNumber}
  * @param pRadioNumber new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setRadioNumber(int pRadioNumber){
    radioNumber = (short) pRadioNumber;
    return this;
}

/** Getter for {@link TransmitterPdu#radioNumber}
  * @return value of interest */
public short getRadioNumber()
{
    return radioNumber; 
}

/** Setter for {@link TransmitterPdu#radioEntityType}
  * @param pRadioEntityType new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setRadioEntityType(RadioType pRadioEntityType)
{
    radioEntityType = pRadioEntityType;
    return this;
}

/** Getter for {@link TransmitterPdu#radioEntityType}
  * @return value of interest */
public RadioType getRadioEntityType()
{
    return radioEntityType; 
}

/** Setter for {@link TransmitterPdu#transmitState}
  * @param pTransmitState new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setTransmitState(TransmitterTransmitState pTransmitState)
{
    transmitState = pTransmitState;
    return this;
}

/** Getter for {@link TransmitterPdu#transmitState}
  * @return value of interest */
public TransmitterTransmitState getTransmitState()
{
    return transmitState; 
}

/** Setter for {@link TransmitterPdu#inputSource}
  * @param pInputSource new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setInputSource(TransmitterInputSource pInputSource)
{
    inputSource = pInputSource;
    return this;
}

/** Getter for {@link TransmitterPdu#inputSource}
  * @return value of interest */
public TransmitterInputSource getInputSource()
{
    return inputSource; 
}

/** Setter for {@link TransmitterPdu#variableTransmitterParameterCount}
  * @param pVariableTransmitterParameterCount new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setVariableTransmitterParameterCount(short pVariableTransmitterParameterCount)
{
    variableTransmitterParameterCount = pVariableTransmitterParameterCount;
    return this;
}
/** Utility setter for {@link TransmitterPdu#variableTransmitterParameterCount}
  * @param pVariableTransmitterParameterCount new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setVariableTransmitterParameterCount(int pVariableTransmitterParameterCount){
    variableTransmitterParameterCount = (short) pVariableTransmitterParameterCount;
    return this;
}

/** Getter for {@link TransmitterPdu#variableTransmitterParameterCount}
  * @return value of interest */
public short getVariableTransmitterParameterCount()
{
    return variableTransmitterParameterCount; 
}

/** Setter for {@link TransmitterPdu#antennaLocation}
  * @param pAntennaLocation new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setAntennaLocation(Vector3Double pAntennaLocation)
{
    antennaLocation = pAntennaLocation;
    return this;
}

/** Getter for {@link TransmitterPdu#antennaLocation}
  * @return value of interest */
public Vector3Double getAntennaLocation()
{
    return antennaLocation; 
}

/** Setter for {@link TransmitterPdu#relativeAntennaLocation}
  * @param pRelativeAntennaLocation new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setRelativeAntennaLocation(Vector3Float pRelativeAntennaLocation)
{
    relativeAntennaLocation = pRelativeAntennaLocation;
    return this;
}

/** Getter for {@link TransmitterPdu#relativeAntennaLocation}
  * @return value of interest */
public Vector3Float getRelativeAntennaLocation()
{
    return relativeAntennaLocation; 
}

/** Setter for {@link TransmitterPdu#antennaPatternType}
  * @param pAntennaPatternType new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setAntennaPatternType(TransmitterAntennaPatternType pAntennaPatternType)
{
    antennaPatternType = pAntennaPatternType;
    return this;
}

/** Getter for {@link TransmitterPdu#antennaPatternType}
  * @return value of interest */
public TransmitterAntennaPatternType getAntennaPatternType()
{
    return antennaPatternType; 
}

/** Setter for {@link TransmitterPdu#frequency}
  * @param pFrequency new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setFrequency(long pFrequency)
{
    frequency = pFrequency;
    return this;
}
/** Utility setter for {@link TransmitterPdu#frequency}
  * @param pFrequency new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setFrequency(int pFrequency){
    frequency = (long) pFrequency;
    return this;
}

/** Getter for {@link TransmitterPdu#frequency}
  * @return value of interest */
public long getFrequency()
{
    return frequency; 
}

/** Setter for {@link TransmitterPdu#transmitFrequencyBandwidth}
  * @param pTransmitFrequencyBandwidth new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setTransmitFrequencyBandwidth(float pTransmitFrequencyBandwidth)
{
    transmitFrequencyBandwidth = pTransmitFrequencyBandwidth;
    return this;
}

/** Getter for {@link TransmitterPdu#transmitFrequencyBandwidth}
  * @return value of interest */
public float getTransmitFrequencyBandwidth()
{
    return transmitFrequencyBandwidth; 
}

/** Setter for {@link TransmitterPdu#power}
  * @param pPower new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setPower(float pPower)
{
    power = pPower;
    return this;
}

/** Getter for {@link TransmitterPdu#power}
  * @return value of interest */
public float getPower()
{
    return power; 
}

/** Setter for {@link TransmitterPdu#modulationType}
  * @param pModulationType new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setModulationType(ModulationType pModulationType)
{
    modulationType = pModulationType;
    return this;
}

/** Getter for {@link TransmitterPdu#modulationType}
  * @return value of interest */
public ModulationType getModulationType()
{
    return modulationType; 
}

/** Setter for {@link TransmitterPdu#cryptoSystem}
  * @param pCryptoSystem new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setCryptoSystem(TransmitterCryptoSystem pCryptoSystem)
{
    cryptoSystem = pCryptoSystem;
    return this;
}

/** Getter for {@link TransmitterPdu#cryptoSystem}
  * @return value of interest */
public TransmitterCryptoSystem getCryptoSystem()
{
    return cryptoSystem; 
}

/** Setter for {@link TransmitterPdu#cryptoKeyId}
  * @param pCryptoKeyId new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setCryptoKeyId(short pCryptoKeyId)
{
    cryptoKeyId = pCryptoKeyId;
    return this;
}
/** Utility setter for {@link TransmitterPdu#cryptoKeyId}
  * @param pCryptoKeyId new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setCryptoKeyId(int pCryptoKeyId){
    cryptoKeyId = (short) pCryptoKeyId;
    return this;
}

/** Getter for {@link TransmitterPdu#cryptoKeyId}
  * @return value of interest */
public short getCryptoKeyId()
{
    return cryptoKeyId; 
}

/** Setter for {@link TransmitterPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setPadding1(byte pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link TransmitterPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setPadding1(int pPadding1){
    padding1 = (byte) pPadding1;
    return this;
}

/** Getter for {@link TransmitterPdu#padding1}
  * @return value of interest */
public byte getPadding1()
{
    return padding1; 
}

/** Setter for {@link TransmitterPdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link TransmitterPdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setPadding2(int pPadding2){
    padding2 = (short) pPadding2;
    return this;
}

/** Getter for {@link TransmitterPdu#padding2}
  * @return value of interest */
public short getPadding2()
{
    return padding2; 
}

/** Setter for {@link TransmitterPdu#modulationParametersList}
  * @param pModulationParametersList new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setModulationParametersList(List<ModulationParameters> pModulationParametersList)
{
    modulationParametersList = pModulationParametersList;
    return this;
}

/** Getter for {@link TransmitterPdu#modulationParametersList}
  * @return value of interest */
public List<ModulationParameters> getModulationParametersList()
{
    return modulationParametersList; 
}

/** Setter for {@link TransmitterPdu#antennaPatternList}
  * @param pAntennaPatternList new value of interest
  * @return same object to permit progressive setters */
public TransmitterPdu setAntennaPatternList(List<VariableTransmitterParameters> pAntennaPatternList)
{
    antennaPatternList = pAntennaPatternList;
    return this;
}

/** Getter for {@link TransmitterPdu#antennaPatternList}
  * @return value of interest */
public List<VariableTransmitterParameters> getAntennaPatternList()
{
    return antennaPatternList; 
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
       header.marshal(dos);
       dos.writeShort(radioNumber);
       radioEntityType.marshal(dos);
       transmitState.marshal(dos);
       inputSource.marshal(dos);
       dos.writeShort(variableTransmitterParameterCount);
       antennaLocation.marshal(dos);
       relativeAntennaLocation.marshal(dos);
       antennaPatternType.marshal(dos);
       dos.writeShort(antennaPatternList.size());
       dos.writeLong(frequency);
       dos.writeFloat(transmitFrequencyBandwidth);
       dos.writeFloat(power);
       modulationType.marshal(dos);
       cryptoSystem.marshal(dos);
       dos.writeShort(cryptoKeyId);
       dos.writeByte(modulationParametersList.size());
       dos.writeByte(padding1);
       dos.writeShort(padding2);

       for(int idx = 0; idx < modulationParametersList.size(); idx++)
       {
            ModulationParameters aModulationParameters = modulationParametersList.get(idx);
            aModulationParameters.marshal(dos);
       }


       for(int idx = 0; idx < antennaPatternList.size(); idx++)
       {
            VariableTransmitterParameters aVariableTransmitterParameters = antennaPatternList.get(idx);
            aVariableTransmitterParameters.marshal(dos);
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
        uPosition += header.unmarshal(dis);
        radioNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += radioEntityType.unmarshal(dis);
        transmitState = TransmitterTransmitState.unmarshalEnum(dis);
        uPosition += transmitState.getMarshalledSize();
        inputSource = TransmitterInputSource.unmarshalEnum(dis);
        uPosition += inputSource.getMarshalledSize();
        variableTransmitterParameterCount = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += antennaLocation.unmarshal(dis);
        uPosition += relativeAntennaLocation.unmarshal(dis);
        antennaPatternType = TransmitterAntennaPatternType.unmarshalEnum(dis);
        uPosition += antennaPatternType.getMarshalledSize();
        antennaPatternCount = (short)dis.readUnsignedShort();
        uPosition += 2;
        frequency = dis.readLong();
        uPosition += 4;
        transmitFrequencyBandwidth = dis.readFloat();
        uPosition += 4;
        power = dis.readFloat();
        uPosition += 4;
        uPosition += modulationType.unmarshal(dis);
        cryptoSystem = TransmitterCryptoSystem.unmarshalEnum(dis);
        uPosition += cryptoSystem.getMarshalledSize();
        cryptoKeyId = (short)dis.readUnsignedShort();
        uPosition += 2;
        modulationParameterCount = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < modulationParameterCount; idx++)
        {
            ModulationParameters anX = new ModulationParameters();
            uPosition += anX.unmarshal(dis);
            modulationParametersList.add(anX);
        }

        for(int idx = 0; idx < antennaPatternCount; idx++)
        {
            VariableTransmitterParameters anX = new VariableTransmitterParameters();
            uPosition += anX.unmarshal(dis);
            antennaPatternList.add(anX);
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
   header.marshal(byteBuffer);
   byteBuffer.putShort( (short)radioNumber);
   radioEntityType.marshal(byteBuffer);
   transmitState.marshal(byteBuffer);
   inputSource.marshal(byteBuffer);
   byteBuffer.putShort( (short)variableTransmitterParameterCount);
   antennaLocation.marshal(byteBuffer);
   relativeAntennaLocation.marshal(byteBuffer);
   antennaPatternType.marshal(byteBuffer);
   byteBuffer.putShort( (short)antennaPatternList.size());
   byteBuffer.putLong( (long)frequency);
   byteBuffer.putFloat( (float)transmitFrequencyBandwidth);
   byteBuffer.putFloat( (float)power);
   modulationType.marshal(byteBuffer);
   cryptoSystem.marshal(byteBuffer);
   byteBuffer.putShort( (short)cryptoKeyId);
   byteBuffer.put( (byte)modulationParametersList.size());
   byteBuffer.put( (byte)padding1);
   byteBuffer.putShort( (short)padding2);

   for(int idx = 0; idx < modulationParametersList.size(); idx++)
   {
        ModulationParameters aModulationParameters = modulationParametersList.get(idx);
        aModulationParameters.marshal(byteBuffer);
   }


   for(int idx = 0; idx < antennaPatternList.size(); idx++)
   {
        VariableTransmitterParameters aVariableTransmitterParameters = antennaPatternList.get(idx);
        aVariableTransmitterParameters.marshal(byteBuffer);
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

    header.unmarshal(byteBuffer);
    radioNumber = (short)(byteBuffer.getShort() & 0xFFFF);
    radioEntityType.unmarshal(byteBuffer);
    transmitState = TransmitterTransmitState.unmarshalEnum(byteBuffer);
    inputSource = TransmitterInputSource.unmarshalEnum(byteBuffer);
    variableTransmitterParameterCount = (short)(byteBuffer.getShort() & 0xFFFF);
    antennaLocation.unmarshal(byteBuffer);
    relativeAntennaLocation.unmarshal(byteBuffer);
    antennaPatternType = TransmitterAntennaPatternType.unmarshalEnum(byteBuffer);
    antennaPatternCount = (short)(byteBuffer.getShort() & 0xFFFF);
    frequency = byteBuffer.getLong();
    transmitFrequencyBandwidth = byteBuffer.getFloat();
    power = byteBuffer.getFloat();
    modulationType.unmarshal(byteBuffer);
    cryptoSystem = TransmitterCryptoSystem.unmarshalEnum(byteBuffer);
    cryptoKeyId = (short)(byteBuffer.getShort() & 0xFFFF);
    modulationParameterCount = (byte)(byteBuffer.get() & 0xFF);
    padding1 = (byte)(byteBuffer.get() & 0xFF);
    padding2 = (short)(byteBuffer.getShort() & 0xFFFF);
    for(int idx = 0; idx < modulationParameterCount; idx++)
    {
    ModulationParameters anX = new ModulationParameters();
    anX.unmarshal(byteBuffer);
    modulationParametersList.add(anX);
    }

    for(int idx = 0; idx < antennaPatternCount; idx++)
    {
    VariableTransmitterParameters anX = new VariableTransmitterParameters();
    anX.unmarshal(byteBuffer);
    antennaPatternList.add(anX);
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

     final TransmitterPdu rhs = (TransmitterPdu)obj;

     if( ! (header.equals( rhs.header) )) ivarsEqual = false;
     if( ! (radioNumber == rhs.radioNumber)) ivarsEqual = false;
     if( ! (radioEntityType.equals( rhs.radioEntityType) )) ivarsEqual = false;
     if( ! (transmitState == rhs.transmitState)) ivarsEqual = false;
     if( ! (inputSource == rhs.inputSource)) ivarsEqual = false;
     if( ! (variableTransmitterParameterCount == rhs.variableTransmitterParameterCount)) ivarsEqual = false;
     if( ! (antennaLocation.equals( rhs.antennaLocation) )) ivarsEqual = false;
     if( ! (relativeAntennaLocation.equals( rhs.relativeAntennaLocation) )) ivarsEqual = false;
     if( ! (antennaPatternType == rhs.antennaPatternType)) ivarsEqual = false;
     if( ! (frequency == rhs.frequency)) ivarsEqual = false;
     if( ! (transmitFrequencyBandwidth == rhs.transmitFrequencyBandwidth)) ivarsEqual = false;
     if( ! (power == rhs.power)) ivarsEqual = false;
     if( ! (modulationType.equals( rhs.modulationType) )) ivarsEqual = false;
     if( ! (cryptoSystem == rhs.cryptoSystem)) ivarsEqual = false;
     if( ! (cryptoKeyId == rhs.cryptoKeyId)) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;

     for(int idx = 0; idx < modulationParametersList.size(); idx++)
        if( ! ( modulationParametersList.get(idx).equals(rhs.modulationParametersList.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < antennaPatternList.size(); idx++)
        if( ! ( antennaPatternList.get(idx).equals(rhs.antennaPatternList.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" header: ").append(header).append("\n");
    sb.append(" radioNumber: ").append(radioNumber).append("\n");
    sb.append(" radioEntityType: ").append(radioEntityType).append("\n");
    sb.append(" transmitState: ").append(transmitState).append("\n");
    sb.append(" inputSource: ").append(inputSource).append("\n");
    sb.append(" variableTransmitterParameterCount: ").append(variableTransmitterParameterCount).append("\n");
    sb.append(" antennaLocation: ").append(antennaLocation).append("\n");
    sb.append(" relativeAntennaLocation: ").append(relativeAntennaLocation).append("\n");
    sb.append(" antennaPatternType: ").append(antennaPatternType).append("\n");
    sb.append(" frequency: ").append(frequency).append("\n");
    sb.append(" transmitFrequencyBandwidth: ").append(transmitFrequencyBandwidth).append("\n");
    sb.append(" power: ").append(power).append("\n");
    sb.append(" modulationType: ").append(modulationType).append("\n");
    sb.append(" cryptoSystem: ").append(cryptoSystem).append("\n");
    sb.append(" cryptoKeyId: ").append(cryptoKeyId).append("\n");
    sb.append(" padding1: ").append(padding1).append("\n");
    sb.append(" padding2: ").append(padding2).append("\n");
    sb.append(" modulationParametersList: ").append("\n");
    modulationParametersList.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" antennaPatternList: ").append("\n");
    antennaPatternList.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
