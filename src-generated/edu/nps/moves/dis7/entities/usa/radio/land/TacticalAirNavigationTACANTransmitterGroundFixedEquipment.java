package edu.nps.moves.dis7.entities.usa.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@37cf91d8;
 * Country: United States of America (USA);
 * Entity kind: Radio;
 * Domain: LAND;
 *
 * Entity type uid: 22210
 */
public class TacticalAirNavigationTACANTransmitterGroundFixedEquipment extends EntityType
{
    /** Default constructor */
    public TacticalAirNavigationTACANTransmitterGroundFixedEquipment()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)10); // uid 22210, Tactical Air Navigation (TACAN) Transmitter (Ground Fixed Equipment)
    }
}
