package edu.nps.moves.dis7.entities.csk.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5b8dfcc1;
 * Country: Czechoslovakia (CSK);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 19122
 */
public class AeroL39ZAlbatros extends EntityType
{
    /** Default constructor */
    public AeroL39ZAlbatros()
    {
        setCountry(Country.ACTION_REQUEST_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 19121, Attack / Strike
        setSubCategory((byte)1); // uid 19122, Aero L-39Z Albatros
    }
}
