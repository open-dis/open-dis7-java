package edu.nps.moves.dis7.entities.cze.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@223191a6;
 * Country: Czech Republic (CZE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 30098
 */
public class AeroL39CAlbatros extends EntityType
{
    /** Default constructor */
    public AeroL39CAlbatros()
    {
        setCountry(Country.CZECH_REPUBLIC_CZE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 30096, Trainer
        setSubCategory((byte)2); // uid 30098, Aero L-39C Albatros
    }
}
