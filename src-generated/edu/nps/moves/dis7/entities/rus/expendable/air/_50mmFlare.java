package edu.nps.moves.dis7.entities.rus.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6c519e47;
 * Country: Russia (RUS);
 * Entity kind: Expendable;
 * Domain: AIR;
 *
 * Entity type uid: 22305
 */
public class _50mmFlare extends EntityType
{
    /** Default constructor */
    public _50mmFlare()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 22301, Flare
        setSubCategory((byte)2); // uid 22305, 50mm Flare
    }
}
