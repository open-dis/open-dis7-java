package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ea04cab;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 11276
 */
public class FCSUAVClassIVb extends EntityType
{
    /** Default constructor */
    public FCSUAVClassIVb()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 11232, Unmanned
        setSubCategory((byte)31); // uid 11274, FCS UAV Class IV
        setSpecific((byte)2); // uid 11276, FCS UAV Class IV-b
    }
}
