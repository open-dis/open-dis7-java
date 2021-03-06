package edu.nps.moves.dis7.entities.csk.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@35e2d654;
 * Country: Czechoslovakia (CSK);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 19127
 */
public class LetL410Turbolet extends EntityType
{
    /** Default constructor */
    public LetL410Turbolet()
    {
        setCountry(Country.ACTION_REQUEST_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 19126, Cargo / Tanker
        setSubCategory((byte)1); // uid 19127, Let L-410 Turbolet
    }
}
