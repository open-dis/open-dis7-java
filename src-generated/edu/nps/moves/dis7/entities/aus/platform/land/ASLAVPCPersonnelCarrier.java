package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4e515669;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 26904
 */
public class ASLAVPCPersonnelCarrier extends EntityType
{
    /** Default constructor */
    public ASLAVPCPersonnelCarrier()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 26901, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 26902, Australian Light Armored Vehicle (ASLAV)
        setSpecific((byte)2); // uid 26904, ASLAV-PC Personnel Carrier
    }
}
