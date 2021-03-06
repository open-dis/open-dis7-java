package edu.nps.moves.dis7.entities.csk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3c19aaa5;
 * Country: Czechoslovakia (CSK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27391
 */
public class Pegas4MHovercraft extends EntityType
{
    /** Default constructor */
    public Pegas4MHovercraft()
    {
        setCountry(Country.ACTION_REQUEST_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 27390, Air Cushion/Surface Effect
        setSubCategory((byte)1); // uid 27391, Pegas 4M Hovercraft
    }
}
