package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6db9f5a4;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28747
 */
public class TPK415FSP extends EntityType
{
    /** Default constructor */
    public TPK415FSP()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 15674, Small Wheeled Utility Vehicle
        setSubCategory((byte)3); // uid 28744, VLRA (Escort, Reconnaissance, Support) 4x4
        setSpecific((byte)3); // uid 28747, TPK 4.15 FSP
    }
}
