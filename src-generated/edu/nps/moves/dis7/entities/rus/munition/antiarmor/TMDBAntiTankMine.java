package edu.nps.moves.dis7.entities.rus.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@69b3886f;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 25685
 */
public class TMDBAntiTankMine extends EntityType
{
    /** Default constructor */
    public TMDBAntiTankMine()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)3); // uid 25651, Fixed
        setSubCategory((byte)14); // uid 25685, TMD-B Anti-Tank Mine
    }
}
