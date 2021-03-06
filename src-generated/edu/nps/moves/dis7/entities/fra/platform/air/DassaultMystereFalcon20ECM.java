package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3514a4c0;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15810
 */
public class DassaultMystereFalcon20ECM extends EntityType
{
    /** Default constructor */
    public DassaultMystereFalcon20ECM()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)6); // uid 15807, Electronic Warfare (EW)
        setSubCategory((byte)3); // uid 15810, Dassault Mystere-Falcon 20 (ECM)
    }
}
