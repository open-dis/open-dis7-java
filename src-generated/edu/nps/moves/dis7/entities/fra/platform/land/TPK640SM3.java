package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@17a7f733;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28775
 */
public class TPK640SM3 extends EntityType
{
    /** Default constructor */
    public TPK640SM3()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 15674, Small Wheeled Utility Vehicle
        setSubCategory((byte)4); // uid 28768, VLRA (Escort, Reconnaissance, Support) 6x6
        setSpecific((byte)7); // uid 28775, TPK 6.40 SM3
    }
}
