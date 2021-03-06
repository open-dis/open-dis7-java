package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ba8a1dc;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28617
 */
public class M113ASArmoredMortarAM extends EntityType
{
    /** Default constructor */
    public M113ASArmoredMortarAM()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 26901, Armored Fighting Vehicle
        setSubCategory((byte)3); // uid 28616, M113-AS4 Armored Personnel Carrier (APC)
        setSpecific((byte)1); // uid 28617, M113-AS Armored Mortar (AM)
    }
}
