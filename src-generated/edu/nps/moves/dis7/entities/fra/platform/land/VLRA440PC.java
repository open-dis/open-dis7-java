package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@52102734
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 28788
 */
public class VLRA440PC extends EntityType
{
    public VLRA440PC()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 15674, Small Wheeled Utility Vehicle
        setSubCategory((byte)5); // uid 28781, VLRA2 (Escort, Reconnaissance, Support) 4x4
        setSpecific((byte)7); // uid 28788, VLRA 440 PC
    }
}
