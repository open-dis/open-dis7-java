package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2234078;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 12629
 */
public class MTLB1V12MartilleryC2 extends EntityType
{
    /** Default constructor */
    public MTLB1V12MartilleryC2()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 12580, Armored Fighting Vehicle
        setSubCategory((byte)7); // uid 12623, MT-LB tracked vehicle
        setSpecific((byte)6); // uid 12629, MT-LB 1V12M (artillery C2)
    }
}
